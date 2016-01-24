/**
 * 
 */
package com.newsagency.controller.exception;

/**
 * @author bikash
 *
 */
public class ArticleCRUDOperationException extends CRUDOperationException {

	public ArticleCRUDOperationException(String message,Throwable cause) {
		super(message,cause);
	}
	
	public ArticleCRUDOperationException(String message) {
		this(message,null);
	}
	
	public ArticleCRUDOperationException(Throwable cause) {
		super(null,cause);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
