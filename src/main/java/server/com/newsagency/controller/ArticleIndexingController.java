/**
 * 
 */
package com.newsagency.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newsagency.article.index.common.ArticleIndexCRUDContext;
import com.newsagency.article.index.common.ArticleIndexCRUDRequest;
import com.newsagency.article.index.create.ArticleIndexCreationContext;
import com.newsagency.article.index.create.ArticleIndexCreationRequest;
import com.newsagency.search.workflow.WorkFlowEngine;
import com.newsagency.search.workflow.exception.StateExecutionException;
import com.newsagency.search.workflow.exception.WorkflowInitializationException;
import com.newsagency.service.url.ArticleIndexingURIConstants;

/**
 * @author bikash
 *
 */
@Controller
public class ArticleIndexingController extends DefaultController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleIndexingController.class);
	
	@Value("${defaultcollection}")
	private String defaultCollection;
	
	@Value("${solr.zkhost}")
	private String zkHost;
	
	@RequestMapping(value = ArticleIndexingURIConstants.INDEX_CREATE_ARTICLE, method = RequestMethod.POST)
	public void createIndexByArticleId(@PathVariable("id") long articleId) {
		logger.info("Received create index request for article :: " + articleId);
		ArticleIndexCRUDRequest creationRequest = new ArticleIndexCreationRequest();
		ArticleIndexCRUDContext ctxt = new ArticleIndexCreationContext();
		creationRequest.setArticleId(articleId);
		creationRequest.setDefaultCollection(defaultCollection);
		ctxt.setZkHost(zkHost);
		WorkFlowEngine<ArticleIndexCRUDContext, ArticleIndexCRUDRequest> engine = new WorkFlowEngine<ArticleIndexCRUDContext, ArticleIndexCRUDRequest>();
		try {
			ctxt.setSpringContext(context);
			engine.initialize(ctxt);
			engine.executeState(ctxt, creationRequest);
		} catch (StateExecutionException e) {
			e.printStackTrace();
		} catch (WorkflowInitializationException e) {
			e.printStackTrace();
		}	
	}

	@RequestMapping(value = ArticleIndexingURIConstants.INDEX_BULK_ARTICLES, method = RequestMethod.POST)
	public void performBulkIndexing(@PathVariable("id") long articleId) {
		logger.info("Received bulk index request for articles :: " + articleId);
	}

	@RequestMapping(value = ArticleIndexingURIConstants.INDEX_DELETE_ARTICLE, method = RequestMethod.POST)
	public void deleteIndexByArticleId(@PathVariable("id") long articleId) {
		logger.info("Received delete index request for article :: " + articleId);
	}

	@RequestMapping(value = ArticleIndexingURIConstants.INDEX_UPDATE_ARTICLE, method = RequestMethod.POST)
	public void updateIndexByArticleId(@PathVariable("id") long articleId) {
		logger.info("Received update index request for article :: " + articleId);
	}

}
