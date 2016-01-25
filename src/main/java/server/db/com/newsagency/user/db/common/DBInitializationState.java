/**
 * 
 */
package com.newsagency.user.db.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class DBInitializationState implements WorkflowState<UserDBCRUDContext, UserDBCRUDRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(DBInitializationState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(UserDBCRUDContext ctxt, UserDBCRUDRequest request) throws WorkflowExecutionException {
		// TODO Auto-generated method stub

	}

}
