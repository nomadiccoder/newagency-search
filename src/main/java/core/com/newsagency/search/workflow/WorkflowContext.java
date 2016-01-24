/**
 * 
 */
package com.newsagency.search.workflow;

/**
 * @author bikash
 *
 */
public interface WorkflowContext {
	
	/**
	 * @param key
	 * @param value
	 */
	void addParam(String key, String value);
	
	/**
	 * @param key
	 */
	String getParamValue(String key);
	
}
