/**
 * 
 */
package com.newsagency.article.search.query;

import org.apache.solr.client.solrj.SolrQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.article.search.common.ArticleSearchContext;
import com.newsagency.article.search.common.ArticleSearchRequest;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchQueryParseState implements WorkflowState<ArticleSearchContext, ArticleSearchRequest>{
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleSearchQueryParseContext.class);

	@Override
	public void execute(ArticleSearchContext ctxt, ArticleSearchRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		SolrQuery query = parseQuery(request.getQueryString());
		ctxt.setQuery(query);
	}

	private SolrQuery parseQuery(String queryString) {
		SolrQuery query = new SolrQuery(queryString);
		return query;
	}

}
