/**
 * 
 */
package com.newsagency.article.db.common;

import com.newsagency.search.workflow.WorkflowRequest;

/**
 * @author bikash
 *
 */
public class ArticleDBCRUDRequest implements WorkflowRequest {
	
	private Long articleId;

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

}
