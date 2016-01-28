/**
 * 
 */
package com.newsagency.article.search.common;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;

import com.newsagency.search.workflow.WorkflowContext;

/**
 * @author bikash
 *
 */
public class ArticleSearchContext implements WorkflowContext{

	@Override
	public void addParam(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getParamValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private CloudSolrClient client;
	
	private SolrQuery query;
	
	private QueryResponse searchResponse;
	
	private ArticleSearchResponseWrapper wrapper;

	public CloudSolrClient getClient() {
		return client;
	}

	public void setClient(CloudSolrClient client) {
		this.client = client;
	}

	public SolrQuery getQuery() {
		return query;
	}

	public void setQuery(SolrQuery query) {
		this.query = query;
	}

	public QueryResponse getSearchResponse() {
		return searchResponse;
	}

	public void setSearchResponse(QueryResponse searchResponse) {
		this.searchResponse = searchResponse;
	}

	public ArticleSearchResponseWrapper getWrapper() {
		return wrapper;
	}

	public void setWrapper(ArticleSearchResponseWrapper wrapper) {
		this.wrapper = wrapper;
	}

}
