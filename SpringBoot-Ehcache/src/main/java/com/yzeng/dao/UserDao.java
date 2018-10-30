package com.yzeng.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yzeng.pojo.User;

public interface UserDao extends JpaRepository<User, Long>{

	
}
