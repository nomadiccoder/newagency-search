/**
 * 
 */
package com.newsagency.client.crud;

import org.springframework.web.client.RestTemplate;

import com.newsagency.article.search.common.ArticleSearchResponseWrapper;
import com.newsagency.model.User;

/**
 * @author bikash
 *
 */
public class UserCrudClient {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		try {

			restTemplate.getForEntity("http://localhost:8080/controller" + "/rest/search/article/stinson", null,
					ArticleSearchResponseWrapper.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
