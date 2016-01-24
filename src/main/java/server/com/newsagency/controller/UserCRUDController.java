/**
 * 
 */
package com.newsagency.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newsagency.model.User;
import com.newsagency.service.url.UserCRUDRestURIConstants;

/**
 * @author bikash
 *
 */
@Controller
public class UserCRUDController extends DefaultController {


	private static final Logger logger = LoggerFactory
			.getLogger(UserCRUDController.class);

	@RequestMapping(value = UserCRUDRestURIConstants.GET_USER_BY_ID, method = RequestMethod.GET)
	public @ResponseBody User getUserById(
			@PathVariable("id") String userId) {
		logger.info("get user by id : " + userId);
		return null;

	}

	// TODO implement pagination
	@Transactional
	@RequestMapping(value = UserCRUDRestURIConstants.GET_ALL_USER, method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers() {
		logger.info("get all users");
		return null;
	}

	@RequestMapping(value = UserCRUDRestURIConstants.CREATE_USER, method = RequestMethod.POST)
	public @ResponseBody User createUser(@RequestBody User user) {
		logger.info("create user");
		return null;
	}

	@RequestMapping(value = UserCRUDRestURIConstants.UPDATE_USER, method = RequestMethod.POST)
	public @ResponseBody User updateUser(@RequestBody User user,
			@PathVariable("id") long id) {
		logger.info("update user : " + id);
		return user;
	}

	@RequestMapping(value = UserCRUDRestURIConstants.DELETLE_USER, method = RequestMethod.DELETE)
	public @ResponseBody void deleteUserById(@PathVariable("id") long id) {
	}


}
