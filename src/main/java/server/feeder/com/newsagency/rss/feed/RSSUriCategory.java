package com.newsagency.rss.feed;

public enum RSSUriCategory {
	
	DESIGN("http://www.wired.com/category/design/feed/"),
	UNDERWIRE("http://www.wired.com/category/underwire/feed/"),
	BUSINESS("http://www.wired.com/category/business/feed/"),
	GEAR("http://www.wired.com/category/gear/feed/"),
	REVIEWS("http://www.wired.com/category/reviews/feed/"),
	SCIENCE("http://www.wired.com/category/science/feed/"),
	SCIENCEBLOGS("http://www.wired.com/category/science/science-blogs/feed/"),
	SECURITY("http://www.wired.com/category/science/science-blogs/feed/"),
	PHOTOS("http://www.wired.com/category/photo/feed/");
	
	private String uri;
	
	RSSUriCategory(String uri){
		this.uri = uri;
	}
	
	String getURI(){
		return uri;
	}
	

}
