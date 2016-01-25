/**
 * 
 */
package com.newsagency.article.db.common;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class FinalizationState implements WorkflowState<ArticleDBCRUDContext, ArticleDBCRUDRequest> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleDBCRUDContext ctxt, ArticleDBCRUDRequest request) throws WorkflowExecutionException {
		// TODO Auto-generated method stub

	}

}
