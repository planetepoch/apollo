package com.apollo.article.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apollo.article.bean.Article;
import com.apollo.article.bean.ArticleQuery;
import com.apollo.article.bean.Result;
import com.apollo.article.bean.ResultBuilder;
import com.apollo.article.service.ArticleService;

@RestController
public class ArticleController {
	
	@Resource
	private ArticleService articleService;
	
	@GetMapping("/article/{id}")
	public Result get(@PathVariable Long id){
		Article a = articleService.getById(id);
		return ResultBuilder.success(a);
	}
	
	@GetMapping("/articles")
	public Result list(ArticleQuery articleQuery){
		List<Article> list = articleService.list(articleQuery);
		return ResultBuilder.success(list);
	}
	
	@PutMapping("/article/{id}")
	public Result update(@PathVariable Long id,@RequestBody Article article){
		article.setId(id);
		articleService.update(article);
		return ResultBuilder.success();
	}
	
	@PostMapping("/article")
	public Result insert(@RequestBody Article article){
		articleService.insert(article);
		return ResultBuilder.success();
	}
	
	@DeleteMapping("/article/{id}")
	public Result delete(@PathVariable Long id){
		articleService.delete(id);
		return ResultBuilder.success();
	}
	

}
