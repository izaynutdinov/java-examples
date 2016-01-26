package net.iskandar.examples.project_management.dao;

public class PagingParams {

	private int firstResult;
	private int maxResults;

	public PagingParams(int firstResult, int maxResults) {
		super();
		this.firstResult = firstResult;
		this.maxResults = maxResults;
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}
	
}
