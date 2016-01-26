/**
 * 
 */
package com.newsagency.rss.feed;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

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
		for (RSSUriCategory uri : RSSUriCategory.values()) {
			System.out.println("Fetching RSS Links for "+uri);
			try {
				URL feedUrl = new URL(uri.getURI());
				SyndFeed feed = input.build(new XmlReader(feedUrl));
				Iterator iterator = feed.getEntries().iterator();
				System.out.println(uri.getURI());
				//System.out.println(feed);
				while(iterator.hasNext()){
					SyndEntry entry = (SyndEntry)iterator.next();
					System.out.println("Author :: "+entry.getAuthor());
					System.out.println("Link :: "+entry.getLink());
					System.out.println("DESC :: "+entry.getDescription().getValue());
					System.out.println("Title :: "+entry.getTitle());
					System.out.println("Date :: "+entry.getPublishedDate());
					System.out.println("URI :: "+entry.getUri());
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
			System.out.println("Fetching RSS Links for "+uri+"*************");
		}
	}
}
