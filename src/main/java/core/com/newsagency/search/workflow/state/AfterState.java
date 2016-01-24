/**
 * 
 */
package com.newsagency.search.workflow.state;

import com.newsagency.search.workflow.WorkflowContext;
import com.newsagency.search.workflow.WorkflowRequest;
import com.newsagency.search.workflow.state.exception.AfterStateExecutionException;

/**
 * @author bikash
 *
 * @param <E>
 * @param <T>
 */
public interface AfterState<E extends WorkflowContext, T extends WorkflowRequest> {

	/**
	 * @param ctxt
	 * @param request
	 * @throws AfterStateExecutionException
	 */
	public void after(E ctxt, T request) throws AfterStateExecutionException;

}
