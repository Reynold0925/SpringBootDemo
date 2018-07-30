package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.UserBean;
import com.example.service.UserService;

@Controller
public class DemoController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/demo")
	@ResponseBody
	public UserBean demo(Integer id) {
		UserBean user;
		try {
			user = userService.findById(id);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/demo1")
	@ResponseBody
	public List<UserBean> demo1() {
		 List<UserBean> userList;
		try {
			userList = userService.findAll();
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}