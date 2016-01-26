/**
 * 
 */
package com.newsagency.article.index.common;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class IndexerFinalizationState implements WorkflowState<ArticleIndexCRUDContext, ArticleIndexCRUDRequest> {

	private static final Logger logger = LoggerFactory.getLogger(IndexerFinalizationState.class);

	@Override
	public void execute(ArticleIndexCRUDContext ctxt, ArticleIndexCRUDRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		try {
			ctxt.getClient().close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new WorkflowExecutionException(e.getMessage());
		}
	}

}
