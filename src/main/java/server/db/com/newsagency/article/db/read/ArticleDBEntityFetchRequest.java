/**
 * 
 */
package com.newsagency.article.db.read;

import com.newsagency.article.db.common.ArticleDBCRUDRequest;
import com.newsagency.article.db.common.DBInitializationState;
import com.newsagency.article.db.common.FinalizationState;
import com.newsagency.search.workflow.States;

/**
 * @author bikash
 *
 */
@States(states={DBInitializationState.class,ArticleDBEntityFetchState.class,FinalizationState.class})
public class ArticleDBEntityFetchRequest extends ArticleDBCRUDRequest {

}
