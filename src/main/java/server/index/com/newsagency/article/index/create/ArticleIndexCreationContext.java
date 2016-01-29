/**
 * 
 */
package com.newsagency.article.index.create;

import org.apache.solr.common.SolrInputDocument;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newsagency.article.index.common.ArticleIndexCRUDContext;

/**
 * @author bikash
 *
 */
public class ArticleIndexCreationContext extends ArticleIndexCRUDContext {
	
	private SolrInputDocument document;
	
	private ClassPathXmlApplicationContext springContext = null;
	
	@Override
	public void addParam(String key, String value) {

	}

	@Override
	public String getParamValue(String key) {
		return null;
	}

	public SolrInputDocument getDocument() {
		return document;
	}

	public void setDocument(SolrInputDocument document) {
		this.document = document;
	}

	public ClassPathXmlApplicationContext getSpringContext() {
		return springContext;
	}

	public void setSpringContext(ClassPathXmlApplicationContext springContext) {
		this.springContext = springContext;
	}

}
