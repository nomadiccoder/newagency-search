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

	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

}
