/**
 * 
 */
package com.newsagency.article.index.create;

import com.newsagency.article.index.common.ArticleIndexCRUDRequest;
import com.newsagency.article.index.common.ArticleInformationRetrievalState;
import com.newsagency.article.index.common.IndexerFinalizationState;
import com.newsagency.article.index.common.IndexerInitializationState;
import com.newsagency.search.workflow.States;

/**
 * @author bikash
 *
 */
@States(states = { ArticleInformationRetrievalState.class, IndexerInitializationState.class, IndexDocCreationState.class,
		FlushIndexDocState.class, IndexerFinalizationState.class })
public class ArticleIndexCreationRequest extends ArticleIndexCRUDRequest {
	
	
}
