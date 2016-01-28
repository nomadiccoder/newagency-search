/**
 * 
 */
package com.newsagency.article.search.common;

import java.io.Serializable;

/**
 * @author bikash
 *
 */
public class ArticleSearchResponseWrapper implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArticleSearchResponseBody body;
	
	private ArticleSearchResponseHeader header;

	public ArticleSearchResponseBody getBody() {
		return body;
	}

	public void setBody(ArticleSearchResponseBody body) {
		this.body = body;
	}

	public ArticleSearchResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ArticleSearchResponseHeader header) {
		this.header = header;
	}

}
