package com.yzeng.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
public class ExceptionController {

	@ApiOperation(value="首页")
	@ApiImplicitParam(name="index")
	@RequestMapping(value="index",method=RequestMethod.GET)
	@ResponseBody
	public String showPage() throws Exception {
		if(true){
            throw new Exception("some exception");
        }
		return "1233";
	}
}
