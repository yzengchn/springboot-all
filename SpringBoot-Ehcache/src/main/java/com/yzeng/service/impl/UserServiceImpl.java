package com.yzeng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yzeng.dao.UserDao;
import com.yzeng.pojo.User;
import com.yzeng.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Override
	@Cacheable(value="userInfo")
	public List<User> getUser() {
		List<User> list = userDao.findAll();
		 System.out.println( "从数据库读取，而非读取缓存！" );
		return list;
	}

}
