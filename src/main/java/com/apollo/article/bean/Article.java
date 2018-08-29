package com.apollo.article.bean;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Article {
	
	private Long id;
	
	private String title;
	
	private String data;
	
	private Date createTime;
	
	private Date updateTime;

}
