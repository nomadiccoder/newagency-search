/**
 * 
 */
package com.newsagency.controller.exception;

/**
 * @author bikash
 *
 */
public class ArticleIndexOperationException extends CRUDOperationException {

	public ArticleIndexOperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ArticleIndexOperationException(String message) {
		this(message, null);
	}

	public ArticleIndexOperationException(Throwable cause) {
		super(null, cause);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
