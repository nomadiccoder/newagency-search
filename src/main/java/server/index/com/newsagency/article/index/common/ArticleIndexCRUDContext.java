/**
 * 
 */
package com.newsagency.article.index.common;

import org.apache.solr.client.solrj.SolrClient;

import com.newsagency.model.Article;
import com.newsagency.search.workflow.WorkflowContext;

/**
 * @author bikash
 *
 */
public class ArticleIndexCRUDContext implements WorkflowContext {

	private Article article;
	
	private SolrClient client;
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.newsagency.search.workflow.WorkflowContext#addParam(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void addParam(String key, String value) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.newsagency.search.workflow.WorkflowContext#getParamValue(java.lang.
	 * String)
	 */
	@Override
	public String getParamValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public SolrClient getClient() {
		return client;
	}

	public void setClient(SolrClient client) {
		this.client = client;
	}
	

}
