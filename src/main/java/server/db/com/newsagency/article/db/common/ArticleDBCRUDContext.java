/**
 * 
 */
package com.newsagency.article.db.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newsagency.dao.ArticleDAO;
import com.newsagency.search.workflow.WorkflowContext;

/**
 * @author bikash
 *
 */
public class ArticleDBCRUDContext implements WorkflowContext {
	
	private ClassPathXmlApplicationContext springContext;
	
	private ArticleDAO articleDAO;

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

	public ClassPathXmlApplicationContext getSpringContext() {
		return springContext;
	}

	public void setSpringContext(ClassPathXmlApplicationContext springContext) {
		this.springContext = springContext;
	}

	public ArticleDAO getArticleDAO() {
		return articleDAO;
	}

	public void setArticleDAO(ArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	
}
