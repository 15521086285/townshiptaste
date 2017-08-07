package com.pc.usersystem.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.pc.usersystem.entity.Userinfo;

/**
 * 用户注册DAO
 */

public interface RegisterDao {
	
	/**注册用户*/
	@Insert("insert into us_user(u_username,u_password,u_cellphonenumber,u_email) values(#{userName},#{passWord},#{cellPhoneNumber},#{email})")
	public int saveRegistrationInformation(Userinfo userinfo);
	
	/**根据账号查询用户*/
	@Select("select u_id,u_username,u_password,u_cellphonenumber,u_email from us_user where u_username=#{userName}")
	@ResultMap("userinfoMap")
	public Userinfo queryUserinfoOnTheUsername(String userName);
	
	/**根据手机号码查询用户*/
	@Select("select u_id,u_username,u_password,u_cellphonenumber,u_email from us_user where u_cellphonenumber=#{cellPhoneNumber}")
	@ResultMap("userinfoMap")
	public Userinfo queryUserinfoOnThePhong(String cellPhoneNumber);
}
