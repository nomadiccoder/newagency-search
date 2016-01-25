/**
 * 
 */
package com.newsagency.article.db.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleDBEntityCreationState
		implements WorkflowState<ArticleDBEntityCreationContext, ArticleDBEntityCreationRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleDBEntityCreationState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleDBEntityCreationContext ctxt, ArticleDBEntityCreationRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing State");
	}

}
