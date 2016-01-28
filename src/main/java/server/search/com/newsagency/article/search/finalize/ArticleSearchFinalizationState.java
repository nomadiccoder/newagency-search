/**
 * 
 */
package com.newsagency.article.search.finalize;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.article.search.common.ArticleSearchContext;
import com.newsagency.article.search.common.ArticleSearchRequest;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchFinalizationState implements WorkflowState<ArticleSearchContext, ArticleSearchRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleSearchFinalizationState.class);

	@Override
	public void execute(ArticleSearchContext ctxt, ArticleSearchRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		try {
			ctxt.getClient().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
