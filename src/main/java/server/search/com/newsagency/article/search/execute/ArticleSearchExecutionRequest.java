/**
 * 
 */
package com.newsagency.article.search.execute;

import com.newsagency.article.search.common.ArticleSearchRequest;
import com.newsagency.article.search.finalize.ArticleSearchFinalizationState;
import com.newsagency.article.search.init.ArticleSearchInitializationState;
import com.newsagency.article.search.query.ArticleSearchQueryParseState;
import com.newsagency.search.workflow.States;

/**
 * @author bikash
 *
 */
@States(states = { ArticleSearchInitializationState.class, ArticleSearchQueryParseState.class,
		ArticleSearchExecutionState.class, ArticleSearchFinalizationState.class })
public class ArticleSearchExecutionRequest extends ArticleSearchRequest {

}
