package com.pc.usersystem.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pc.publicclass.util.ReceiveParametersToJSON;
import com.pc.publicclass.util.newclass.CreateAnEntityClass;
import com.pc.usersystem.service.LoginService;

/**
 * 用户登录控制器
 * @author Administrator
 *
 */
@Controller
public class LoginController {
	
	@Resource
	private LoginService loginService;
	
	/**
	 * 用户账号密码登录
	 * @param request
	 * @return boolean  true:登录成功  false：用户名或者密码错误
	 */
	@RequestMapping(method=RequestMethod.POST,value="/userLogin.html")
	@ResponseBody
	public String LoginToTheUsernameAndPassword(@RequestParam(value="data") String data,HttpServletRequest request){
		JSONObject successJSON = new JSONObject();
		System.out.println(successJSON);
		JSONObject json = ReceiveParametersToJSON.stringToJSON(data);
		boolean success = false;
		try {
			success = loginService.loginToJudge(json.getString("userName"), json.getString("passWord"));
			successJSON.put("success", success);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		if(success){
			try {
				request.getSession().setAttribute("userName", json.getString("userName"));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return successJSON.toString();
	}
	
	/**
	 * 手机号码验证登录
	 * @param request
	 * @return boolean true:登录成功  false：验证码错误
	 */
	public String LoginToThePhongNumber(HttpServletRequest request){
		//into 需要接入短信接口
		return null;
	}
	
	
	/**
	 * 手机号码找回密码
	 * @param request
	 * @return StringJSON
	 */
	public String phongNumberRetrievePassword(HttpServletRequest request){
		//into 需要接入短信接口
		return null;
	}
	
	
}

