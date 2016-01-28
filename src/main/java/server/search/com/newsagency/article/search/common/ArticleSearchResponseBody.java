/**
 * 
 */
package com.newsagency.article.search.common;

import java.io.Serializable;
import java.util.List;

/**
 * @author bikash
 *
 */
public class ArticleSearchResponseBody implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int resultCount;
	
	private List<ArticleSearchResult> responses;

	public int getResultCount() {
		return resultCount;
	}

	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}

	public List<ArticleSearchResult> getResponses() {
		return responses;
	}

	public void setResponses(List<ArticleSearchResult> responses) {
		this.responses = responses;
	}

}
