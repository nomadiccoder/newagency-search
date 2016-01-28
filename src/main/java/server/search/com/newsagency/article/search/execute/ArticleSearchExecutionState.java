/**
 * 
 */
package com.newsagency.article.search.execute;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchExecutionState
		implements WorkflowState<ArticleSearchExecutionContext, ArticleSearchExecutionRequest> {

	/* (non-Javadoc)
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.search.workflow.WorkflowContext, com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleSearchExecutionContext ctxt, ArticleSearchExecutionRequest request)
			throws WorkflowExecutionException {
		// TODO Auto-generated method stub

	}

}
