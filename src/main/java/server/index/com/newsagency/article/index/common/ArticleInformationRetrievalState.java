/**
 * 
 */
package com.newsagency.article.index.common;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.article.db.read.ArticleDBEntityFetchContext;
import com.newsagency.article.db.read.ArticleDBEntityFetchRequest;
import com.newsagency.model.Article;
import com.newsagency.search.workflow.WorkFlowEngine;
import com.newsagency.search.workflow.WorkflowContext;
import com.newsagency.search.workflow.WorkflowRequest;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.StateExecutionException;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;
import com.newsagency.search.workflow.exception.WorkflowInitializationException;

/**
 * @author bikash
 * @param <R>
 *
 */
public class ArticleInformationRetrievalState
		implements WorkflowState<ArticleIndexCRUDContext, ArticleIndexCRUDRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleInformationRetrievalState.class);
	
	private ArticleIndexCRUDContext context = null;

	@Override
	public void execute(ArticleIndexCRUDContext ctxt, ArticleIndexCRUDRequest request)
			throws WorkflowExecutionException {
		
		logger.info("Executing state");
		this.context = ctxt; 
		Article articleById = fetchArticleById(request.getArticleId());
		context.setArticle(articleById);
	}

	private Article fetchArticleById(Long articleId) {
		ArticleDBEntityFetchRequest fetchRequest = new ArticleDBEntityFetchRequest();
		ArticleDBEntityFetchContext fetchContext = new ArticleDBEntityFetchContext();
		fetchRequest.setArticleId(articleId);
		fetchContext.setSpringContext(context.getSpringContext());
		WorkFlowEngine<WorkflowContext,WorkflowRequest> engine = new WorkFlowEngine<WorkflowContext, WorkflowRequest>();
		try {
			engine.initialize(fetchContext);
			engine.executeState(fetchContext, fetchRequest);
			List<Article> articles = fetchContext.getArticles();
			if(articles != null && !articles.isEmpty()){
				return articles.get(0);
			}
		} catch (StateExecutionException e) {
			e.printStackTrace();
		} catch (WorkflowInitializationException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
