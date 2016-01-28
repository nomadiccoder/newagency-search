/**
 * 
 */
package com.newsagency.article.search.common;

import java.io.Serializable;

/**
 * @author bikash
 *
 */
public class ArticleSearchResponseHeader implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int resultCount;

	public int getResultCount() {
		return resultCount;
	}

	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}

}
