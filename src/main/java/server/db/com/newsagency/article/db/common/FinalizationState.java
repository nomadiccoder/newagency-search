/**
 * 
 */
package com.newsagency.article.db.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class FinalizationState implements WorkflowState<ArticleDBCRUDContext, ArticleDBCRUDRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(FinalizationState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleDBCRUDContext ctxt, ArticleDBCRUDRequest request) throws WorkflowExecutionException {
		logger.info("Executing state");
		ctxt.setArticleDAO(null);
	}

}
