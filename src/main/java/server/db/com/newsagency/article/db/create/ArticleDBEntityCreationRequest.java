/**
 * 
 */
package com.newsagency.article.db.create;

import com.newsagency.article.db.common.ArticleDBCRUDRequest;
import com.newsagency.article.db.common.DBInitializationState;
import com.newsagency.article.db.common.FinalizationState;
import com.newsagency.model.Article;
import com.newsagency.search.workflow.States;

/**
 * @author bikash
 *
 */
@States(states={DBInitializationState.class,ArticleDBEntityCreationState.class,FinalizationState.class})
public class ArticleDBEntityCreationRequest extends ArticleDBCRUDRequest {
	
	private Article article;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
