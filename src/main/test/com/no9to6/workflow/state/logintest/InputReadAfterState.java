/**
 * 
 */
package com.no9to6.workflow.state.logintest;

import com.quickpay.automation.workflow.WorkflowContext;
import com.quickpay.automation.workflow.WorkflowRequest;
import com.quickpay.automation.workflow.state.AfterState;
import com.quickpay.automation.workflow.state.BeforeState;
import com.quickpay.automation.workflow.state.exception.AfterStateExecutionException;
import com.quickpay.automation.workflow.state.exception.BeforeStateExecutionException;

/**
 * @author sasmita
 *
 */
public class InputReadAfterState implements AfterState {

	@Override
	public void after(WorkflowContext ctxt, WorkflowRequest request)
			throws AfterStateExecutionException {
		System.out.println("After State : Input Read");
	}


}
