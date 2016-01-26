package com.newsagency.search.workflow.exception;

/**
 * @author bikash
 *
 */
public class WorkflowExecutionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WorkflowExecutionException(String message , Throwable cause) {
		super(message,cause);
	}
	
	public WorkflowExecutionException(Throwable cause) {
		this(null,cause);
	}
	
	public WorkflowExecutionException(String message) {
		this(message,null);
	}

}
