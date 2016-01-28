/**
 * 
 */
package com.newsagency.article.search.response;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchResponseParseState
		implements WorkflowState<ArticleSearchResponseParseContext, ArticleSearchResponseParseRequest> {

	/* (non-Javadoc)
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.search.workflow.WorkflowContext, com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleSearchResponseParseContext ctxt, ArticleSearchResponseParseRequest request)
			throws WorkflowExecutionException {
		
	}

}
