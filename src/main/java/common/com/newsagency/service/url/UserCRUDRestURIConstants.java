package com.newsagency.service.url;

/**
 * @author bikash
 *
 */
public interface UserCRUDRestURIConstants {

	String GET_USER_BY_ID = "/rest/user/{id}";
	String GET_ALL_USER = "/rest/users";
	String CREATE_USER = "/rest/user/create";
	String DELETLE_USER = "/rest/user/delete/{id}";
	String UPDATE_USER = "/rest/user/update/{id}";

}
