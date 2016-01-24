package com.newsagency.search.workflow;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author bikash
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface States {
	@SuppressWarnings("rawtypes")
	Class<? extends WorkflowState>[] states();

}
