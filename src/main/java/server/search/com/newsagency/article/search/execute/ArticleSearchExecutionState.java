/**
 * 
 */
package com.newsagency.article.search.execute;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.params.MapSolrParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchExecutionState
		implements WorkflowState<ArticleSearchExecutionContext, ArticleSearchExecutionRequest> {
	
	private static final Logger logger =  LoggerFactory.getLogger(ArticleSearchExecutionState.class);
	
	private ArticleSearchExecutionContext context;

	/* (non-Javadoc)
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.search.workflow.WorkflowContext, com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleSearchExecutionContext ctxt, ArticleSearchExecutionRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
		this.context = ctxt;
		SolrQuery query = ctxt.getQuery();
		performSearch(query);
	}

	private void performSearch(SolrQuery query) {
		CloudSolrClient client = context.getClient();
		Map<String, String> map = prepareParamMap(query);
		try {
			QueryResponse response = client.query(new MapSolrParams(map));
			logger.info("Query Response : "+response.toString());
			context.setSearchResponse(response);
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Map<String, String> prepareParamMap(SolrQuery query) {
		Set<String> parameterNames = query.getParameterNames();
		HashMap<String,String> queryMap = new HashMap<String, String>();
		for (String key : parameterNames) {
			queryMap.put(key, query.get(key));
		}
		return queryMap;
	}

}
