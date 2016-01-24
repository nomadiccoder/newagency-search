/**
 * 
 */
package com.newsagency.article.index.common;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class IndexDocCreationState implements WorkflowState<IndexerCreationContext, IndexerCreationRequest> {

	@Override
	public void execute(IndexerCreationContext ctxt, IndexerCreationRequest request) throws WorkflowExecutionException {

	}

}
