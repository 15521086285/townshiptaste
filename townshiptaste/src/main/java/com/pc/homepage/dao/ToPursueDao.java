package com.pc.homepage.dao;

import org.apache.ibatis.annotations.Insert;

import com.pc.homepage.entity.ToPursueEntity;

/**
 * 用户追加评论dao
 * @author Administrator
 *
 */
public interface ToPursueDao {
	/**
	 * 保存追加评论
	 * @param toPursueEntity
	 * @return int 
	 */
	@Insert("insert into pc_hp_topursue(tp_commentId,tp_toPursueTime,tp_toPursueContent) values(#{commentId},#{toPursueTime},#{toPursueContent})")
	public int saveTheReview(ToPursueEntity toPursueEntity);
}
