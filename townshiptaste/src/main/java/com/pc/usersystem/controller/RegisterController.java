package com.pc.usersystem.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pc.publicclass.util.ReceiveParametersToJSON;
import com.pc.usersystem.entity.Userinfo;
import com.pc.usersystem.service.RegisterService;

@Controller
public class RegisterController {
	/*
	 * 注册用户控制器
	 */
	@Resource
	private RegisterService registerService;
	/**
	 * 保存注册用户信息
	 * @param request
	 * @return boolean true:注册成功 false：注册失败
	 */
	@RequestMapping(method=RequestMethod.POST,value="/register.html")
	@ResponseBody
	public String saveRegistrationInformation(@RequestParam(value="data") String data){
		JSONObject json = ReceiveParametersToJSON.stringToJSON(data);
		System.out.println(data);
		Userinfo userinfo = new Userinfo();
		try {
			userinfo.setUserName(json.getString("userName"));
			userinfo.setPassWord(json.getString("passWord"));
			userinfo.setCellPhoneNumber(json.getString("cellPhoneNumber"));
			userinfo.setEmail(json.getString("email"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		// userName:h12345,passWord:h12345,cellPhoneNumber:13543335545,email:h670256910@163.com
		boolean success = registerService.saveRegistrationInformation(userinfo);
		JSONObject successJSON = new JSONObject();
		try {
			successJSON.put("success", success);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return successJSON.toString();
	}
	
	/**
	 * 查询用户名是否被注册
	 * @param request
	 * @return boolean true表示账户不存在，false表示账号已经存在
	 */
	@RequestMapping(method=RequestMethod.POST,value="/accountRepeat.html")
	@ResponseBody
	public String accountRepeat(@RequestParam(value="userName") String userName){
		userName = userName.trim();
		System.out.println(userName);
		boolean success = registerService.accountRepeat(userName);
		JSONObject successJSON = new JSONObject();
		try {
			successJSON.put("success", success);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return successJSON.toString();	
	}
	
	/**
	 * 查询手机号码是否被注册
	 * @param request
	 * @return boolean true：手机可用  false：手机已被注册
	 */
	@RequestMapping(method=RequestMethod.POST,value="/thePhoneAlreadyExists.html")
	@ResponseBody
	public String thePhoneAlreadyExists(@RequestParam(value="cellPhoneNumber") String cellPhoneNumber){
		System.out.println("数据："+cellPhoneNumber);
		boolean success = registerService.thePhoneAlreadyExists(cellPhoneNumber.trim()); 
		JSONObject successJSON = new JSONObject();
		try {
			successJSON.put("success", success);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return successJSON.toString();
	}
	
	/**
	 * 注册手机号码验证
	 * @param request
	 * @return
	 */
	public String registerToThePhongNumber(HttpServletRequest request){
		//Todo 需要手机验证接口
		return null;
	}
}
