package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.entity.UserBean;


public interface UserMapper {

	void insertUser(UserBean user) throws Exception;
	
	void updateUser(@Param("name")String name, @Param("age")Integer age, @Param("id")Integer id) throws Exception;
	
	void updateUser1(UserBean user) throws Exception;
	
	void deleteUser(Integer id) throws Exception;
	
	UserBean findById(Integer id) throws Exception;
	
	List<UserBean> findAll() throws Exception;
	
}
