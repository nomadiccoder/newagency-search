/**
 * 
 */
package com.newsagency.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.dao.AbstractDAO;
import com.newsagency.dao.ArticleDAO;
import com.newsagency.model.Article;

/**
 * @author bikash
 *
 */
public class ArticleDAOImpl extends AbstractDAO implements ArticleDAO {

	private static final Logger logger = LoggerFactory.getLogger(ArticleDAOImpl.class);

	@Override
	public Article save(Article article) {
		logger.info("Creating new article");
		try {
			beginTransacation();
			this.getSession().save(article);
			return article;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			commitTransaction();
		}
	}

	@Override
	public List<Article> fetchAll() {
		logger.info("list all articles");
		try {
			beginTransacation();
			@SuppressWarnings("unchecked")
			List<Article> articles = this.getSession().createQuery("from Article").list();
			return articles;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			commitTransaction();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Article fetchById(String id) {
		logger.info("find article by article id : " + id);
		try {
			beginTransacation();
			Session session = this.getSession();
			StringBuilder queryBuilder = new StringBuilder(" from Article");
			queryBuilder.append(" where id = " + id);
			Query query = session.createQuery(queryBuilder.toString());
			List<Article> articles = query.list();
			Article article = (articles != null && !articles.isEmpty()) ? articles.get(0) : null;
			return article;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			commitTransaction();
		}
	}

	@Override
	public boolean delete(long id) {
		logger.info("delete article by article id : " + id);
		try {
			beginTransacation();
			Session session = this.getSession();
			Object load = session.load(Article.class, id);
			if (load != null) {
				session.delete(load);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			commitTransaction();
		}
	}

	@Override
	public Article update(long id, Article article) {
		logger.info("Update article by article id " + id);

		try {
			beginTransacation();
			this.getSession().update(String.valueOf(id), article);
			return article;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			commitTransaction();
		}
	}

}
