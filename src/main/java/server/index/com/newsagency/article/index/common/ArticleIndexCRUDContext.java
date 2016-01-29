/**
 * 
 */
package com.newsagency.article.index.common;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newsagency.model.Article;
import com.newsagency.search.workflow.WorkflowContext;

/**
 * @author bikash
 *
 */
public class ArticleIndexCRUDContext implements WorkflowContext {

	private Article article;
	
	private CloudSolrClient client;
	
	private ClassPathXmlApplicationContext springContext;
	
	private String zkHost;
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

	public CloudSolrClient getClient() {
		return client;
	}

	public void setClient(CloudSolrClient client) {
		this.client = client;
	}

	public ClassPathXmlApplicationContext getSpringContext() {
		return springContext;
	}

	public void setSpringContext(ClassPathXmlApplicationContext springContext) {
		this.springContext = springContext;
	}

	public String getZkHost() {
		return zkHost;
	}

	public void setZkHost(String zkHost) {
		this.zkHost = zkHost;
	}
	

}
