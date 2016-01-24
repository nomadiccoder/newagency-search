/**
 * 
 */
package com.newsagency.search.workflow.state;

import com.newsagency.search.workflow.WorkflowContext;
import com.newsagency.search.workflow.WorkflowRequest;
import com.newsagency.search.workflow.state.exception.BeforeStateExecutionException;

/**
 * @author bikash
 *
 * @param <T>
 * @param <E>
 */
public interface BeforeState<T extends WorkflowContext, E extends WorkflowRequest> {

	/**
	 * @param ctxt
	 * @param request
	 * @throws BeforeStateExecutionException
	 */
	public void before(T ctxt, E request) throws BeforeStateExecutionException;

}
