package com.pc.usersystem.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.pc.usersystem.entity.Userinfo;

public interface LoginDao {
	/**根据用户名密码查询用户信息*/
	@Select("select u_id,u_username,u_password,u_cellphonenumber,u_email from us_user where u_username=#{userName}")
	@ResultMap("loginDaoMapper")
	public Userinfo getUserToTheUsernameAndPassword(String userName);
	
}
