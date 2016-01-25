/**
 * 
 */
package com.newsagency.article.index.create;

import com.newsagency.article.index.common.ArticleIndexCRUDRequest;
import com.newsagency.article.index.common.ArticleInformationRetrievalState;
import com.newsagency.article.index.common.FinalizationState;
import com.newsagency.article.index.common.IndexerCreationState;
import com.newsagency.search.workflow.States;

/**
 * @author bikash
 *
 */
@States(states = { ArticleInformationRetrievalState.class, IndexerCreationState.class, IndexDocCreationState.class,
		FlushIndexDocState.class, FinalizationState.class })
public class ArticleIndexCreationRequest extends ArticleIndexCRUDRequest {

}
