package com.yzeng.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 创建全局异常处理类：通过使用@ControllerAdvice定义统一的异常处理类，而不是在每个Controller中逐个定义。
 * '@ExceptionHandler用来定义函数针对的异常类型，最后将Exception对象和请求URL映射到error.html中
 * @author Yao.Zeng
 *
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<Exception> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    	ErrorInfo<Exception> errorInfo = new ErrorInfo<>();
        errorInfo.setCode(ErrorInfo.OK);
        errorInfo.setData(e);
        errorInfo.setMsg("系统异常");
        errorInfo.setUrl(String.valueOf(req.getRequestURL()));
        return errorInfo;
    }
 
}
