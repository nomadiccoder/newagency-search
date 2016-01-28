/**
 * 
 */
package com.newsagency.article.index.create;

import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.model.Article;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class IndexDocCreationState implements WorkflowState<ArticleIndexCreationContext, ArticleIndexCreationRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexDocCreationState.class);
	
	private ArticleIndexCreationContext context;

	@Override
	public void execute(ArticleIndexCreationContext ctxt, ArticleIndexCreationRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		this.context = ctxt;
		Article article = ctxt.getArticle();
		SolrInputDocument inputDoc = new SolrInputDocument();
		inputDoc.addField("id", article.getId());
		inputDoc.addField("author", article.getAuthor());
		inputDoc.addField("title", article.getTitle());
		inputDoc.addField("publicationDate", article.getPublicationDate());
		inputDoc.addField("category", article.getCategory());
		inputDoc.addField("description", article.getDescription());
		inputDoc.addField("link", article.getLinkUri());
		inputDoc.addField("fullContentUri", article.getFullContentUri());
		context.setDocument(inputDoc);
	}

}
