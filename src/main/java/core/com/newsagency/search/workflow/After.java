/**
 * 
 */
package com.newsagency.search.workflow;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.newsagency.search.workflow.state.AfterState;

/**
 * @author bikash
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface After {

	@SuppressWarnings("rawtypes")
	Class<? extends AfterState>[] names();

}
