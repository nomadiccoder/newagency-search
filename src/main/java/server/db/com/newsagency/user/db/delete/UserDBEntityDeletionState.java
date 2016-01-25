/**
 * 
 */
package com.newsagency.user.db.delete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class UserDBEntityDeletionState
		implements WorkflowState<UserDBEntityDeletionContext, UserDBEntityDeletionRequest> {

	private static final Logger logger = LoggerFactory.getLogger(UserDBEntityDeletionState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(UserDBEntityDeletionContext ctxt, UserDBEntityDeletionRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing State");
	}

}
