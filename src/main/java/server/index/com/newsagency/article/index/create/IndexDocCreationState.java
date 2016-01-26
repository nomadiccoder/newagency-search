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
		SolrInputDocument document = new SolrInputDocument();
		Article article = ctxt.getArticle();
		document.addField("author", article.getAuthor());
		document.addField("title", article.getTitle());
		document.addField("publicationDate", article.getPublicationDate());
		document.addField("category", article.getCategory());
		document.addField("description", article.getDescription());
		document.addField("link", article.getLinkUri());
		document.addField("fullContentUri", article.getFullContentUri());
		context.setDocument(document);
	}

}
