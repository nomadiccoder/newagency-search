package com.newsagency.search.workflow;

import com.newsagency.search.workflow.exception.StateExecutionException;
import com.newsagency.search.workflow.exception.WorkflowInitializationException;

/**
 * @author bikash
 *
 * @param <T>
 * @param <E>
 */
public interface WorkflowEngineDef<T extends WorkflowContext, E extends WorkflowRequest> {

	/**
	 * @param ctxt
	 * @throws WorkflowInitializationException
	 */
	void initialize(T ctxt) throws WorkflowInitializationException;

	/**
	 * @param ctxt
	 * @param request
	 * @throws StateExecutionException
	 */
	void executeState(T ctxt, E request) throws StateExecutionException;

}
