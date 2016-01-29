/**
 * 
 */
package com.newsagency.article.search.common;

import com.newsagency.search.workflow.WorkflowRequest;

/**
 * @author bikash
 *
 */
public class ArticleSearchRequest implements WorkflowRequest {
	
	private String queryString;
	
	private String defaultCollection;

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getDefaultCollection() {
		return defaultCollection;
	}

	public void setDefaultCollection(String defaultCollection) {
		this.defaultCollection = defaultCollection;
	}

}
