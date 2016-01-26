/**
 * 
 */
package com.newsagency.rss.feed;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newsagency.article.db.create.ArticleDBEntityCreationContext;
import com.newsagency.article.db.create.ArticleDBEntityCreationRequest;
import com.newsagency.model.Article;
import com.newsagency.search.workflow.WorkFlowEngine;
import com.newsagency.search.workflow.WorkflowContext;
import com.newsagency.search.workflow.WorkflowRequest;
import com.newsagency.search.workflow.exception.StateExecutionException;
import com.newsagency.search.workflow.exception.WorkflowInitializationException;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

/**
 * @author bikash
 *
 */
public class RSSFeedReader {

	public static void main(String[] args) {
		SyndFeedInput input = new SyndFeedInput();
		ClassPathXmlApplicationContext context = null;
		if (context == null) {
			context = new ClassPathXmlApplicationContext("spring.xml");
		}
		for (RSSUriCategory uri : RSSUriCategory.values()) {
			System.out.println("Fetching RSS Links for " + uri);
			try {
				URL feedUrl = new URL(uri.getURI());
				SyndFeed feed = input.build(new XmlReader(feedUrl));
				Iterator iterator = feed.getEntries().iterator();
				System.out.println(uri.getURI());
				// System.out.println(feed);
				while (iterator.hasNext()) {
					Article article = new Article();
					SyndEntry entry = (SyndEntry) iterator.next();
					System.out.println("Author :: " + entry.getAuthor());
					article.setAuthor(entry.getAuthor());
					System.out.println("Link :: " + entry.getLink());
					article.setLinkUri(entry.getLink());
					System.out.println("DESC :: " + entry.getDescription().getValue());
					article.setDescription(entry.getDescription().getValue());
					System.out.println("Title :: " + entry.getTitle());
					article.setTitle(entry.getTitle());
					System.out.println("Date :: " + entry.getPublishedDate());
					article.setPublicationDate(entry.getPublishedDate());
					System.out.println("URI :: " + entry.getUri());
					article.setFullContentUri(entry.getUri());

					article.setCategory(uri.name());
					ArticleDBEntityCreationRequest creationRequest = new ArticleDBEntityCreationRequest();
					creationRequest.setArticle(article);
					ArticleDBEntityCreationContext ctxt = new ArticleDBEntityCreationContext();
					ctxt.setSpringContext(context);
					try {
						WorkFlowEngine<WorkflowContext, WorkflowRequest> workFlowEngine = new WorkFlowEngine<WorkflowContext, WorkflowRequest>();
						workFlowEngine.initialize(ctxt);
						workFlowEngine.executeState(ctxt, creationRequest);
					} catch (StateExecutionException e) {
						e.printStackTrace();
					} catch (WorkflowInitializationException e) {
						e.printStackTrace();
					}
					System.out.println("=======================");
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (FeedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Fetching RSS Links for " + uri + "*************");
		}
		context.close();
	}
}
