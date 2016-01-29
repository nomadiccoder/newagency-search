/**
 * 
 */
package com.newsagency.article.index.create;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class FlushIndexDocState implements WorkflowState<ArticleIndexCreationContext, ArticleIndexCreationRequest> {

	private static final Logger logger = LoggerFactory.getLogger(FlushIndexDocState.class);

	@Override
	public void execute(ArticleIndexCreationContext ctxt, ArticleIndexCreationRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		CloudSolrClient client = ctxt.getClient();
		SolrInputDocument document = ctxt.getDocument();
		try {
			client.add(document);
			client.commit();
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
