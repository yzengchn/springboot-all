package com.yzeng.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzeng.pojo.User;
import com.yzeng.service.UserService;

@RestController
public class IndexController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/getUser")
	public List<User> getUser(){
		return userService.getUser();
	}
}
