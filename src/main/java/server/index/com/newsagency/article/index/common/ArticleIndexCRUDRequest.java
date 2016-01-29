/**
 * 
 */
package com.newsagency.article.index.common;

import com.newsagency.search.workflow.WorkflowRequest;

/**
 * @author bikash
 *
 */
public class ArticleIndexCRUDRequest implements WorkflowRequest {
	
	private Long articleId;
	
	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	
	private String defaultCollection;

	public String getDefaultCollection() {
		return defaultCollection;
	}

	public void setDefaultCollection(String defaultCollection) {
		this.defaultCollection = defaultCollection;
	}

}
