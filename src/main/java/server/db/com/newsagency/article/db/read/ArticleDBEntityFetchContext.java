/**
 * 
 */
package com.newsagency.article.db.read;

import java.util.List;

import com.newsagency.article.db.common.ArticleDBCRUDContext;
import com.newsagency.model.Article;

/**
 * @author bikash
 *
 */
public class ArticleDBEntityFetchContext extends ArticleDBCRUDContext {
	
	private List<Article> articles;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.newsagency.search.workflow.WorkflowContext#addParam(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void addParam(String key, String value) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.newsagency.search.workflow.WorkflowContext#getParamValue(java.lang.
	 * String)
	 */
	@Override
	public String getParamValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
