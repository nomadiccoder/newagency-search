package com.newsagency.search.workflow;

import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 * @param <T>
 * @param <E>
 */
public interface WorkflowState<T extends WorkflowContext, E extends WorkflowRequest> {

	/**
	 * @param ctxt
	 * @param request
	 * @throws WorkflowExecutionException
	 */
	public void execute(T ctxt, E request) throws WorkflowExecutionException;

}
