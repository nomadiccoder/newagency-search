/**
 * 
 */
package com.newsagency.article.db.read;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleDBEntityFetchState
		implements WorkflowState<ArticleDBEntityFetchContext, ArticleDBEntityFetchRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleDBEntityFetchState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleDBEntityFetchContext ctxt, ArticleDBEntityFetchRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing State");
	}

}
