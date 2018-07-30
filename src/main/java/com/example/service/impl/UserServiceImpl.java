package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserBean;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public void insertUser(UserBean user) throws Exception {
		userMapper.insertUser(user);
	}

	@Override
	public void updateUser(String name, Integer age, Integer id) throws Exception {
		userMapper.updateUser(name, age, id);
	}

	@Override
	public void updateUser1(UserBean user) throws Exception {
		userMapper.updateUser1(user);
	}

	@Override
	public void deleteUser(Integer id) throws Exception {
		userMapper.deleteUser(id);
	}

	@Override
	public UserBean findById(Integer id) throws Exception {
		UserBean user = userMapper.findById(id);
		return user;
	}

	@Override
	public List<UserBean> findAll() throws Exception {
		 List<UserBean> userList = userMapper.findAll();
		return userList;
	}

}
