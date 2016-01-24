/**
 * 
 */
package com.no9to6.workflow.context.logintest;

import java.util.HashMap;
import java.util.Map;

import com.quickpay.automation.workflow.WorkflowContext;

/**
 * @author sasmita
 *
 */
public class LoginTestContext implements WorkflowContext {

	public Map<String, String> params = new HashMap<String, String>();

	@Override
	public void addParam(String key, String value) {
		params.put(key, value);
	}

	@Override
	public String getParamValue(String key) {
		return params.get(key);
	}

}
