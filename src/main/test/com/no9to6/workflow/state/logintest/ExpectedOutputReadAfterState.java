/**
 * 
 */
package com.no9to6.workflow.state.logintest;

import com.quickpay.automation.workflow.WorkflowContext;
import com.quickpay.automation.workflow.WorkflowRequest;
import com.quickpay.automation.workflow.state.AfterState;
import com.quickpay.automation.workflow.state.exception.AfterStateExecutionException;

/**
 * @author sasmita
 *
 */
public class ExpectedOutputReadAfterState implements AfterState {

	@Override
	public void after(WorkflowContext ctxt, WorkflowRequest request)
			throws AfterStateExecutionException {
		System.out.println("After State : Expected Output");
	}

}
