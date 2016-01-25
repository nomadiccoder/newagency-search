/**
 * 
 */
package com.newsagency.article.index.delete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleIndexDocDeletionState
		implements WorkflowState<ArticleIndexDeleteContext, ArticleIndexDeleteRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleIndexDocDeletionState.class);

	@Override
	public void execute(ArticleIndexDeleteContext ctxt, ArticleIndexDeleteRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
	}

}
