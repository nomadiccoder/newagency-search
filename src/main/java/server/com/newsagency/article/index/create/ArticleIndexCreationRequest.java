/**
 * 
 */
package com.newsagency.article.index.create;

import com.newsagency.article.index.common.ArticleInformationRetrievalState;
import com.newsagency.search.workflow.States;
import com.newsagency.search.workflow.WorkflowRequest;

/**
 * @author bikash
 *
 */
@States(states={ArticleInformationRetrievalState.class})
public class ArticleIndexCreationRequest implements WorkflowRequest{

}
