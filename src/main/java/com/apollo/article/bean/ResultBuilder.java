package com.apollo.article.bean;

public class ResultBuilder {
	
	public static Result success() {
		return new Result(Result.SUCCESS, null, null);
	}

	public static Result success(Object value) {
		return new Result(Result.SUCCESS, null, value);
	}

	public static Result error(Exception e) {
		return new Result(Result.ERROR, e.getMessage(), null);
	}

	public static Result error(int code, String msg) {
		return new Result(code, msg, null);
	}

}
