/**
 * 
 */
package com.newsagency.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newsagency.article.search.common.ArticleSearchContext;
import com.newsagency.article.search.common.ArticleSearchRequest;
import com.newsagency.article.search.common.ArticleSearchResponseWrapper;
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

	@Value("${defaultcollection}")
	private String defaultCollection;
	
	@Value("{solr.zkhost}")
	private String zkHost;
	
	@RequestMapping(value = ArticleSearchURIConstants.SEARCH_ARTICLE, method = RequestMethod.GET)
	public @ResponseBody ArticleSearchResponseWrapper search(@PathVariable("query") String queryString) {
		logger.info("Executing search for query " + queryString);
		ArticleSearchContext ctxt = new ArticleSearchExecutionContext();
		ArticleSearchRequest request = new ArticleSearchExecutionRequest();
		WorkFlowEngine<ArticleSearchContext, ArticleSearchRequest> engine = new WorkFlowEngine<ArticleSearchContext, ArticleSearchRequest>();
		ArticleSearchResponseWrapper wrapper = null;
		request.setQueryString(queryString);
		request.setDefaultCollection(defaultCollection);
		ctxt.setZkHost(zkHost);
		try {
			engine.initialize(ctxt);
			engine.executeState(ctxt, request);
			wrapper = ctxt.getWrapper();
			return wrapper;
		} catch (WorkflowInitializationException e) {
			e.printStackTrace();
		} catch (StateExecutionException e) {
			e.printStackTrace();
		}
		return wrapper;
	}

}
