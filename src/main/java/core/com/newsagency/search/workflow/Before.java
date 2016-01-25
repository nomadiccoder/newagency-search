/**
 * 
 */
package com.newsagency.search.workflow;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.newsagency.search.workflow.state.BeforeState;

/**
 * @author bikash
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Before {

	@SuppressWarnings("rawtypes")
	Class<? extends BeforeState>[] names();

}
