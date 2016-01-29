/**
 * 
 */
package com.newsagency.article.index.common;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class IndexerInitializationState implements WorkflowState<ArticleIndexCRUDContext, ArticleIndexCRUDRequest> {

	private static final Logger logger = LoggerFactory.getLogger(IndexerInitializationState.class);

	@Override
	public void execute(ArticleIndexCRUDContext ctxt, ArticleIndexCRUDRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		CloudSolrClient client = new CloudSolrClient(ctxt.getZkHost());
		client.setDefaultCollection(request.getDefaultCollection());
		ctxt.setClient(client);
	}

}
