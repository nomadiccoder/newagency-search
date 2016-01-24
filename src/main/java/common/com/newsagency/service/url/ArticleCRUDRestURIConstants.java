/**
 * 
 */
package com.newsagency.service.url;

/**
 * @author bikash
 *
 */
public interface ArticleCRUDRestURIConstants {
	
	String GET_ARTICLE_BY_ID = "/rest/article/{id}";
	String GET_ALL_ARTICLES = "/rest/articles";
	String CREATE_ARTICLE = "/rest/article/create";
	String DELETLE_ARTICLE = "/rest/article/delete/{id}";
	String UPDATE_ARTICLE = "/rest/article/update/{id}";

}
