/**
 * 
 */
package com.newsagency.dao;

import java.util.List;

import com.newsagency.model.Article;

/**
 * @author bikash
 *
 */
public interface ArticleDAO {

	public Article save(Article article);

	public List<Article> fetchAll();

	public Article fetchById(String id);

	public boolean delete(long id);

	public Article update(long id, Article customer);

}
