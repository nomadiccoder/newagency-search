/**
 * 
 */
package com.newsagency.controller;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newsagency.service.url.ArticleIndexingURIConstants;

/**
 * @author bikash
 *
 */
@Controller
public class ArticleIndexingController extends DefaultController {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleIndexingController.class);
	
	@RequestMapping(value=ArticleIndexingURIConstants.INDEX_CREATE_ARTICLE,method=RequestMethod.POST)
	public void createIndexByArticleId(@PathVariable("id") long articleId){
		logger.info("Received create index request for article :: "+articleId);
		CloudSolrClient client = new CloudSolrClient("localhost:2181");
		client.setDefaultCollection("newsapp");
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("author", "sasmita");
		doc.addField("topic", "family");
		try {
			client.commit();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value=ArticleIndexingURIConstants.INDEX_BULK_ARTICLES,method=RequestMethod.POST)
	public void performBulkIndexing(@PathVariable("id") long articleId){
		logger.info("Received bulk index request for articles :: "+articleId);
	}
	
	@RequestMapping(value=ArticleIndexingURIConstants.INDEX_DELETE_ARTICLE,method=RequestMethod.POST)
	public void deleteIndexByArticleId(@PathVariable("id") long articleId){
		logger.info("Received delete index request for article :: "+articleId);
	}
	
	@RequestMapping(value=ArticleIndexingURIConstants.INDEX_UPDATE_ARTICLE,method=RequestMethod.POST)
	public void updateIndexByArticleId(@PathVariable("id") long articleId){
		logger.info("Received update index request for article :: "+articleId);
	}
	
}
