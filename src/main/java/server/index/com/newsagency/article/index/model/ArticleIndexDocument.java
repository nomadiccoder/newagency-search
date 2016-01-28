/**
 * 
 */
package com.newsagency.article.index.model;

import java.util.Date;

/**
 * @author bikash
 *
 */
public class ArticleIndexDocument {
	
	private String title;

	private String description;

	private String author;
	
	private String linkUri;
	
	private String fullContentUri;
	
	private Date publicationDate;
	
	private String category;
	
	private Date createdOn;
	
	private Date updatedOn;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getAuthor() {
		return author;
	}

	public String getLinkUri() {
		return linkUri;
	}

	public String getFullContentUri() {
		return fullContentUri;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public String getCategory() {
		return category;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}
	
	public static Builder getBuilder(Long id,String title){
		return new Builder(id,title);
	}

	public static class Builder{
		
		private ArticleIndexDocument build;

		public Builder(Long id, String title) {
			build = new ArticleIndexDocument();
			build.id = id;
			build.title = title;
		}
		
		public Builder description(String description){
			build.description = description;
			return this;
		}
		
		public ArticleIndexDocument build(){
			return build;
		}
		
		
		
	}


}
