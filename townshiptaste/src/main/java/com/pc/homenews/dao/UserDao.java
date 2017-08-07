package com.pc.homenews.dao;

import org.apache.ibatis.annotations.Select;

import com.pc.homenews.entity.User;

public interface UserDao {
	@Select("select * from user_t where id=1")
	public User getUser();
}
