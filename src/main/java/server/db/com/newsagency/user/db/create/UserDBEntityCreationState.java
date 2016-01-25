/**
 * 
 */
package com.newsagency.user.db.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class UserDBEntityCreationState
		implements WorkflowState<UserDBEntityCreationContext, UserDBEntityCreationRequest> {

	private static final Logger logger = LoggerFactory.getLogger(UserDBEntityCreationState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(UserDBEntityCreationContext ctxt, UserDBEntityCreationRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing State");
	}

}
