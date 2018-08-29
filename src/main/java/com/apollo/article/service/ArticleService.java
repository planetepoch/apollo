package com.apollo.article.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.apollo.article.bean.Article;
import com.apollo.article.bean.ArticleQuery;
import com.apollo.article.mapper.ArticleMapper;

@Service
public class ArticleService {
	
	@Resource
	private ArticleMapper articleMapper;
	
	public Article getById(Long id){
		Article a  = articleMapper.get(id);
		Assert.notNull(a, "没有查询到数据");
		return a;
	}
	
	public List<Article> list(ArticleQuery articleQuery){
		List<Article> list = articleMapper.list(articleQuery);
		Assert.notEmpty(list,"没有查到数据");
		return list;
	}
	
	public void insert(Article article){
		articleMapper.insert(article);
	}
	
	public void update(Article article){
		articleMapper.update(article);
	}
	
	public void delete(Long id){
		articleMapper.delete(id);
	}

}
