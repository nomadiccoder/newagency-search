package com.no9to6.workflow.request.test;

import com.no9to6.workflow.context.logintest.LoginTestContext;
import com.quickpay.automation.workflow.WorkFlowEngine;
import com.quickpay.automation.workflow.exception.StateExecutionException;
import com.quickpay.automation.workflow.exception.WorkflowInitializationException;

/**
 * @author sasmita
 *
 */
public class WorkflowRequestTester {

	public static void main(String[] args)
			throws WorkflowInitializationException, StateExecutionException {
		LoginPageTestRequest loginPageTestRequest = new LoginPageTestRequest();
		LoginTestContext loginTestContext = new LoginTestContext();
		WorkFlowEngine<LoginTestContext, LoginPageTestRequest> engine = new WorkFlowEngine<LoginTestContext, LoginPageTestRequest>();
		engine.initialize(loginTestContext);
		engine.executeState(loginTestContext, loginPageTestRequest);

	}

}
