/**
 * 
 */
package com.newsagency.controller.exception;

/**
 * @author bikash
 *
 */
public class UserCRUDOperationException extends CRUDOperationException {

	public UserCRUDOperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserCRUDOperationException(String message) {
		this(message, null);
	}

	public UserCRUDOperationException(Throwable cause) {
		super(null, cause);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
