package com.pc.homepage.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.pc.homepage.entity.LikeEntity;

public interface LikeDao {
	/**
	 * 查询用户是否点赞过
	 * @param userId
	 * @param commentId
	 * @return 点赞实体类
	 */
	@Select("select * from pc_hp_like where l_userId=#{userId} and l_commentId=#{commentId}")
	@ResultMap("likeMapper")
	public LikeEntity selectPointsPoRemember(int userId,int commentId);
	
	/**
	 * 添加用户点赞记录
	 * @param likeEntity
	 * @return int
	 */
	@Insert("insert into pc_hp_like(l_userId,l_commentId) values(#{userId},#{commentId})")
	public int insertPointsPoRemember(LikeEntity likeEntity);
	

}
