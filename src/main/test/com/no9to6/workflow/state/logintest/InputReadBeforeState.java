/**
 * 
 */
package com.no9to6.workflow.state.logintest;

import com.quickpay.automation.workflow.WorkflowContext;
import com.quickpay.automation.workflow.WorkflowRequest;
import com.quickpay.automation.workflow.state.BeforeState;
import com.quickpay.automation.workflow.state.exception.BeforeStateExecutionException;

/**
 * @author sasmita
 *
 */
public class InputReadBeforeState implements BeforeState {

	/* (non-Javadoc)
	 * @see com.no9to6.workflow.state.BeforeState#before(com.no9to6.workflow.WorkflowContext, com.no9to6.workflow.WorkflowRequest)
	 */
	@Override
	public void before(WorkflowContext ctxt, WorkflowRequest request)
			throws BeforeStateExecutionException {
		System.out.println("Before State : Input Read");
	}

}
