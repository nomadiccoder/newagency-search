/**
 * 
 */
package com.newsagency.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.junit.Ignore;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bikash
 *
 */
@Entity
@Table(name = "article")
public class Article implements Serializable {
	
	@Column(name="title")
	private String title;

	@Column(name="content")
	@JsonProperty("content")
	private String description;

	@Column(name="author")
	private String author;
	
	@Column(name="linkUri")
	private String linkUri;
	
	@JsonProperty("directUrl")
	@Column(name="fullContentUri")
	private String fullContentUri;
	
	@Column(name="publishedDate")
	private Date publicationDate;
	
	@Column(name="category")
	private String category;
	
	@Column(name="createdOn")
	private Date createdOn;
	
	@Column(name="updatedOn")
	private Date updatedOn;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLinkUri() {
		return linkUri;
	}

	public void setLinkUri(String linkUri) {
		this.linkUri = linkUri;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getupdatedOn() {
		return updatedOn;
	}

	public void setupdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getFullContentUri() {
		return fullContentUri;
	}

	public void setFullContentUri(String fullContentUri) {
		this.fullContentUri = fullContentUri;
	}
}
