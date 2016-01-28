/**
 * 
 */
package com.newsagency.article.search.common;

/**
 * @author bikash
 *
 */
public enum ResponseFields {

	AUTHOR("author"), TITLE("title"), DESCRIPTION("description"), URL("directUrl");

	private String fieldName;

	ResponseFields(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldName() {
		return fieldName;
	}

}
