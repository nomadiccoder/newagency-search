/**
 * 
 */
package com.newsagency.article.index.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.article.index.create.IndexDocCreationState;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class IndexerCreationState implements WorkflowState<ArticleIndexCRUDContext, ArticleIndexCRUDRequest> {

	private static final Logger logger = LoggerFactory.getLogger(IndexDocCreationState.class);

	@Override
	public void execute(ArticleIndexCRUDContext ctxt, ArticleIndexCRUDRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
	}

}
