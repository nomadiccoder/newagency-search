/**
 * 
 */
package com.newsagency.controller.exception;

/**
 * @author bikash
 *
 */
public class CRUDOperationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CRUDOperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public CRUDOperationException(String message) {
		this(message, null);
	}

	public CRUDOperationException(Throwable cause) {
		this(null, cause);
	}

}
