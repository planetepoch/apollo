package com.apollo.article.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apollo.article.bean.Result;
import com.apollo.article.bean.ResultBuilder;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultErrorHandler(HttpServletRequest req,HttpServletResponse res, Exception e) throws Exception {
		return ResultBuilder.error(e);
    }


}
