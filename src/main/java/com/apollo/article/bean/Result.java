package com.apollo.article.bean;

public class Result {
	
	public static final int SUCCESS = 0;
	
	public static final int ERROR = -1;
	
	private int code;
	
	private String msg;
	
	private Object value; 
	
	public Result(){
		
	}
	
	public Result(int code,String msg,Object value){
		this.code = code;
		this.msg =  msg;
		this.value = value;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", value=" + value + "]";
	}
	
}
