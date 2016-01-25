/**
 * 
 */
package com.newsagency.user.db.update;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class UserDBEntityUpdateState implements WorkflowState<UserDBEntityUpdateContext, UserDBEntityUpdateRequest> {

	private static final Logger logger = LoggerFactory.getLogger(UserDBEntityUpdateState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(UserDBEntityUpdateContext ctxt, UserDBEntityUpdateRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing State");
	}

}
