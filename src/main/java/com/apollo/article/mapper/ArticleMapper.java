package com.apollo.article.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.apollo.article.bean.Article;
import com.apollo.article.bean.ArticleQuery;

@Component
@Mapper
public interface ArticleMapper {
	
	@Select("select id,title,data,create_time,update_time from article where id = #{id}")
	@ResultMap("com.apollo.article.mapper.ArticleMapper.ResultMap")  
	Article get(Long id);
	
	int insert(Article article);
	
	int update(Article article);
	
	@Delete("delete from article where id  = #{id}")
	int delete(Long id);

	List<Article> list(ArticleQuery articleQuery);
	
}
