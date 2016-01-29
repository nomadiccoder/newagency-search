/**
 * 
 */
package com.newsagency.controller;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.noggit.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.newsagency.article.db.create.ArticleDBEntityCreationContext;
import com.newsagency.article.db.create.ArticleDBEntityCreationRequest;
import com.newsagency.article.db.read.ArticleDBEntityFetchContext;
import com.newsagency.article.db.read.ArticleDBEntityFetchRequest;
import com.newsagency.model.Article;
import com.newsagency.search.workflow.WorkFlowEngine;
import com.newsagency.search.workflow.WorkflowContext;
import com.newsagency.search.workflow.WorkflowRequest;
import com.newsagency.search.workflow.exception.StateExecutionException;
import com.newsagency.search.workflow.exception.WorkflowInitializationException;
import com.newsagency.service.url.ArticleCRUDRestURIConstants;

/**
 * @author bikash
 *
 */
@Controller
public class ArticleCRUDController extends DefaultController {

	private static final Logger logger = LoggerFactory.getLogger(ArticleCRUDController.class);

	@RequestMapping(value = ArticleCRUDRestURIConstants.GET_ARTICLE_BY_ID, method = RequestMethod.GET)
	public @ResponseBody Article getArticleById(@PathVariable("id") String articleId) {
		logger.info("get article by id : " + articleId);
		return null;

	}

	// TODO implement pagination
	@Transactional
	@RequestMapping(value = ArticleCRUDRestURIConstants.GET_ALL_ARTICLES, method = RequestMethod.GET)
	public @ResponseBody List<Article> getArticles() {
		logger.info("get all articles");
		List<Article> articles = null;
		ArticleDBEntityFetchContext articleDBEntityFetchContext = new ArticleDBEntityFetchContext();
		ArticleDBEntityFetchRequest articleDBEntityFetchRequest = new ArticleDBEntityFetchRequest();
		articleDBEntityFetchContext.setSpringContext(context);
		WorkFlowEngine<WorkflowContext, WorkflowRequest> engine = new WorkFlowEngine<WorkflowContext, WorkflowRequest>();
		try {
			engine.initialize(articleDBEntityFetchContext);
			engine.executeState(articleDBEntityFetchContext, articleDBEntityFetchRequest);
			articles = articleDBEntityFetchContext.getArticles();
		} catch (WorkflowInitializationException e) {
			e.printStackTrace();
		} catch (StateExecutionException e) {
			e.printStackTrace();
		}
		return articles;
	}

	@RequestMapping(value = ArticleCRUDRestURIConstants.CREATE_ARTICLE, method = RequestMethod.POST)
	public @ResponseBody Article createArticle(@RequestBody String article) {
		ObjectMapper objectMapper = new ObjectMapper();
		Article articleObj = null;
		try {
			 articleObj = objectMapper.readValue(article, Article.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArticleDBEntityCreationContext ctxt = new ArticleDBEntityCreationContext();
		ArticleDBEntityCreationRequest request = new ArticleDBEntityCreationRequest();
		ctxt.setSpringContext(context);
		WorkFlowEngine<WorkflowContext, WorkflowRequest> engine = new WorkFlowEngine<WorkflowContext, WorkflowRequest>();
		request.setArticle(articleObj);
		try {
			engine.initialize(ctxt);;
			engine.executeState(ctxt, request);
		} catch (StateExecutionException e) {
			e.printStackTrace();
		} catch (WorkflowInitializationException e) {
			e.printStackTrace();
		}
		Article savedArticle = new Article();
		return savedArticle;
	}

	@RequestMapping(value = ArticleCRUDRestURIConstants.UPDATE_ARTICLE, method = RequestMethod.POST)
	public @ResponseBody Article updateArticle(@RequestBody Article article, @PathVariable("id") long id) {
		logger.info("update article : " + id);
		return article;
	}

	@RequestMapping(value = ArticleCRUDRestURIConstants.DELETLE_ARTICLE, method = RequestMethod.DELETE)
	public @ResponseBody void deleteArticleById(@PathVariable("id") long id) {
	}

}
