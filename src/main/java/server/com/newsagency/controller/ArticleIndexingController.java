/**
 * 
 */
package com.newsagency.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newsagency.article.index.create.ArticleIndexCreationRequest;
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
		ArticleIndexCreationRequest creationRequest = new ArticleIndexCreationRequest();
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
