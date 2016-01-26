/**
 * 
 */
package com.newsagency.article.db.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newsagency.dao.ArticleDAO;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class DBInitializationState implements WorkflowState<ArticleDBCRUDContext, ArticleDBCRUDRequest> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	
	private ArticleDBCRUDContext context;
	@Override
	public void execute(ArticleDBCRUDContext ctxt, ArticleDBCRUDRequest request) throws WorkflowExecutionException {
		this.context = ctxt;
		ArticleDAO articleDao = intializeArticleDao();
		context.setArticleDAO(articleDao);
	}

	private ArticleDAO intializeArticleDao() {
		ClassPathXmlApplicationContext springContext = context.getSpringContext();
		return springContext.getBean(ArticleDAO.class);
	}

}
