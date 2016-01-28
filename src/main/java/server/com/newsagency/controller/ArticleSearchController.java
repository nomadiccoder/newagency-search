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

import com.newsagency.article.search.execute.ArticleSearchExecutionContext;
import com.newsagency.article.search.execute.ArticleSearchExecutionRequest;
import com.newsagency.search.workflow.WorkFlowEngine;
import com.newsagency.search.workflow.exception.StateExecutionException;
import com.newsagency.search.workflow.exception.WorkflowInitializationException;
import com.newsagency.service.url.ArticleSearchURIConstants;

/**
 * @author bikash
 *
 */
@Controller
public class ArticleSearchController extends DefaultController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleSearchController.class);

	@RequestMapping(value = ArticleSearchURIConstants.SEARCH_ARTICLE, method = RequestMethod.GET)
	public void search(@PathVariable("query") String queryString) {
		logger.info("Executing search for query " + queryString);
		WorkFlowEngine<ArticleSearchExecutionContext, ArticleSearchExecutionRequest> engine = new WorkFlowEngine<ArticleSearchExecutionContext, ArticleSearchExecutionRequest>();
		ArticleSearchExecutionContext ctxt = new ArticleSearchExecutionContext();
		ArticleSearchExecutionRequest request = new ArticleSearchExecutionRequest();
		request.setQueryString(queryString);
		try {
			engine.initialize(ctxt);
			engine.executeState(ctxt, request);
		} catch (WorkflowInitializationException e) {
			e.printStackTrace();
		} catch (StateExecutionException e) {
			e.printStackTrace();
		}

	}

}
