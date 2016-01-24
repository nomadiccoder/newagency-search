/**
 * 
 */
package com.no9to6.workflow.request.test;

import com.no9to6.workflow.state.logintest.ExpectedOutputReadState;
import com.no9to6.workflow.state.logintest.InputReadState;
import com.quickpay.automation.workflow.States;
import com.quickpay.automation.workflow.WorkflowRequest;

/**
 * @author sasmita
 *
 */
@States(states = { InputReadState.class ,ExpectedOutputReadState.class})
public class LoginPageTestRequest implements WorkflowRequest{

}
