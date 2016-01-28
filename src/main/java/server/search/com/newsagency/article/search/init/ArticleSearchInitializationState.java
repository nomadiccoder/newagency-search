/**
 * 
 */
package com.newsagency.article.search.init;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchInitializationState implements WorkflowState<ArticleSearchInitializationContext, ArticleSearchInitializationRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleSearchInitializationState.class);
	
	private ArticleSearchInitializationContext ctxt;

	@Override
	public void execute(ArticleSearchInitializationContext ctxt, ArticleSearchInitializationRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		CloudSolrClient client = new CloudSolrClient("localhost:2181");
		ctxt.setClient(client);
		
	}

}
