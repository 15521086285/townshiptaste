package com.pc.usersystem.service;
/**
 * 用户登录service
 * @author Administrator
 *
 */
public interface LoginService {
	/**用户登录判断*/
	public boolean loginToJudge(String userName,String passWord);
}
