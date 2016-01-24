/**
 * 
 */
package com.newsagency.client.crud;

import org.springframework.web.client.RestTemplate;

import com.newsagency.model.User;

/**
 * @author bikash
 *
 */
public class UserCrudClient {
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		try {

			restTemplate.getForObject("http://localhost:8080/controller" + "/rest/user/" + 1, User.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
