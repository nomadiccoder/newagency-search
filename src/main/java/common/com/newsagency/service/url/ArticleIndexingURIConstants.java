/**
 * 
 */
package com.newsagency.service.url;

/**
 * @author bikash
 *
 */
public interface ArticleIndexingURIConstants {

	String INDEX_CREATE_ARTICLE = "/rest/article/index/{id}";
	String INDEX_BULK_ARTICLES = "/rest/articles/index/{id}";
	String INDEX_DELETE_ARTICLE = "/rest/article/index/delete/{id}";
	String INDEX_UPDATE_ARTICLE = "/rest/article/index/update/{id}";

}
