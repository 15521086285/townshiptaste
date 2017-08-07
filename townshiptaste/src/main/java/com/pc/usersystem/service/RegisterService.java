package com.pc.usersystem.service;

import com.pc.usersystem.entity.Userinfo;

/**
 * 用户注册service接口
 */
public interface RegisterService {
	/**注册用户*/
	public boolean saveRegistrationInformation(Userinfo userinfo);
	/**判断账号是否已经被注册*/
	public boolean accountRepeat(String userName);
	/**判断账号是否已经被注册*/
	public boolean thePhoneAlreadyExists(String cellPhoneNumber);
}
