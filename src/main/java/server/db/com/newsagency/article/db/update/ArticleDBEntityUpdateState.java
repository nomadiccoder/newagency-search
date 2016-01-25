/**
 * 
 */
package com.newsagency.article.db.update;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleDBEntityUpdateState
		implements WorkflowState<ArticleDBEntityUpdateContext, ArticleDBEntityUpdateRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleDBEntityUpdateState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleDBEntityUpdateContext ctxt, ArticleDBEntityUpdateRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing State");
	}

}
