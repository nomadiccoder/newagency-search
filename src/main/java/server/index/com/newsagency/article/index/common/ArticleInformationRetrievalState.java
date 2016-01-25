/**
 * 
 */
package com.newsagency.article.index.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 * @param <R>
 *
 */
public class ArticleInformationRetrievalState
		implements WorkflowState<ArticleIndexCRUDContext, ArticleIndexCRUDRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleInformationRetrievalState.class);

	@Override
	public void execute(ArticleIndexCRUDContext ctxt, ArticleIndexCRUDRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
	}

}
