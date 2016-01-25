/**
 * 
 */
package com.newsagency.article.index.create;

import com.newsagency.search.workflow.States;
import com.newsagency.search.workflow.WorkflowRequest;

/**
 * @author bikash
 *
 */
@States(states={ArticleInformationRetrievalState.class,IndexerCreationState.class,IndexDocCreationState.class,FlushIndexDocState.class,FinalizationState.class})
public class ArticleIndexCreationRequest implements WorkflowRequest{

}
