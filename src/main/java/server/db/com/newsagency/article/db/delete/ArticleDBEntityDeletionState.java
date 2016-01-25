/**
 * 
 */
package com.newsagency.article.db.delete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleDBEntityDeletionState
		implements WorkflowState<ArticleDBEntityDeletionContext, ArticleDBEntityDeletionRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleDBEntityDeletionState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleDBEntityDeletionContext ctxt, ArticleDBEntityDeletionRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing State");
	}

}
