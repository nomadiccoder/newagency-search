/**
 * 
 */
package com.newsagency.article.search.response;

import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.util.NamedList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.article.search.common.ArticleSearchContext;
import com.newsagency.article.search.common.ArticleSearchRequest;
import com.newsagency.article.search.common.ArticleSearchResponseBody;
import com.newsagency.article.search.common.ArticleSearchResponseHeader;
import com.newsagency.article.search.common.ArticleSearchResponseWrapper;
import com.newsagency.article.search.common.ArticleSearchResult;
import com.newsagency.article.search.common.ResponseFields;
import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleSearchResponseParseState
		implements WorkflowState<ArticleSearchContext, ArticleSearchRequest> {
	
	private static final Logger logger = LoggerFactory.getLogger(ArticleSearchResponseParseState.class);

	/* (non-Javadoc)
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.search.workflow.WorkflowContext, com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleSearchContext ctxt, ArticleSearchRequest request)
			throws WorkflowExecutionException {
		QueryResponse queryResponse = ctxt.getSearchResponse();
		SolrDocumentList results = queryResponse.getResults();
		NamedList<Object> responseHeader = queryResponse.getHeader();
		ArticleSearchResponseHeader header = prepareResponseHeader(responseHeader);
		NamedList<Object> responseBody = queryResponse.getResponse();
		ArticleSearchResponseBody body = prepareResponsesBody(responseBody);
		List<ArticleSearchResult> responses = new ArrayList<ArticleSearchResult>();
		for (SolrDocument solrDocument : results) {
			ArticleSearchResult response = new ArticleSearchResult();
			for (ResponseFields field : ResponseFields.values()){
				Object fieldValue = null;
				switch (field) {
				case AUTHOR:
					fieldValue = solrDocument.getFieldValue(field.getFieldName());
					response.setAuthor(fieldValue == null?null:fieldValue.toString());
					break;
				case DESCRIPTION:
					fieldValue = solrDocument.getFieldValue(field.getFieldName());
					response.setDescription(fieldValue == null?null:fieldValue.toString());
					break;
				case TITLE:
					fieldValue = solrDocument.getFieldValue(field.getFieldName());
					response.setTitle(fieldValue == null?null:fieldValue.toString());
					break;
					
				case URL:
					fieldValue = solrDocument.getFieldValue(field.getFieldName());
					response.setDirectUrl(fieldValue == null?null:fieldValue.toString());
					break;
				default:
					break;
				}
			}
			responses.add(response);
		}
		logger.info("queryResponse : "+queryResponse);
		logger.info("Result Count" + responses.size());
		body.setResponses(responses);
		ArticleSearchResponseWrapper responseWrapper = new ArticleSearchResponseWrapper();
		responseWrapper.setBody(body);
		responseWrapper.setHeader(header);
		ctxt.setWrapper(responseWrapper);
	}

	private ArticleSearchResponseBody prepareResponsesBody(NamedList<Object> responseBody) {
		return new ArticleSearchResponseBody();
	}

	private ArticleSearchResponseHeader prepareResponseHeader(NamedList<Object> responseHeader) {
		return new ArticleSearchResponseHeader();
	}

}
