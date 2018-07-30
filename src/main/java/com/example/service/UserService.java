package com.example.service;

import java.util.List;

import com.example.entity.UserBean;

public interface UserService {

	public void insertUser(UserBean user) throws Exception;

	public void updateUser(String name, Integer age, Integer id) throws Exception;

	public void updateUser1(UserBean user) throws Exception;

	public void deleteUser(Integer id) throws Exception;

	public UserBean findById(Integer id) throws Exception;

	public List<UserBean> findAll() throws Exception;

}
