/**
 * 
 */
package com.newsagency.article.search.init;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.article.search.common.ArticleSearchContext;
import com.newsagency.article.search.common.ArticleSearchRequest;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchInitializationState implements WorkflowState<ArticleSearchContext, ArticleSearchRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleSearchInitializationState.class);
	
	private ArticleSearchInitializationContext ctxt;

	@Override
	public void execute(ArticleSearchContext ctxt, ArticleSearchRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		CloudSolrClient client = new CloudSolrClient("localhost:2181");
		client.setDefaultCollection(request.getDefaultCollection());
		ctxt.setClient(client);
	}

}
