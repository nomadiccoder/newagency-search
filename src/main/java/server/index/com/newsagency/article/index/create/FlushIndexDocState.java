/**
 * 
 */
package com.newsagency.article.index.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class FlushIndexDocState implements WorkflowState<ArticleIndexCreationContext, ArticleIndexCreationRequest> {

	private static final Logger logger = LoggerFactory.getLogger(FlushIndexDocState.class);

	@Override
	public void execute(ArticleIndexCreationContext ctxt, ArticleIndexCreationRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
	}

}
