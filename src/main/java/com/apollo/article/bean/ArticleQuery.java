package com.apollo.article.bean;

public class ArticleQuery {
	
	private static final int DEFAULT_PAGE_SIZE = 10;
	
	private static final int DEFAULT_PAGE_NO = 1;
	
	private int pageSize;
	
	private int pageNo;
	
	private int from;

	public int getPageSize() {
		if(pageSize <= 0 ){
			pageSize = DEFAULT_PAGE_SIZE;
		}
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		if(pageNo <= 1){
			pageNo = DEFAULT_PAGE_NO;
		}
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getFrom() {
		from = (pageNo - 1) * pageSize;
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}
	

}
