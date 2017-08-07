package com.pc.homenews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pc.homenews.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser.do")
	public void getUser(){
		System.out.println("进入controller！");
		System.out.println(userService.getUser().getUsername());
	}
	@RequestMapping("/aa.do")
	@ResponseBody
	public String aa(){
		System.out.println("进去aacontroller！");
		return "abc";
	}
}
