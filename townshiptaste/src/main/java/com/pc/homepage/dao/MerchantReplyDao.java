package com.pc.homepage.dao;

import org.apache.ibatis.annotations.Insert;

import com.pc.homepage.entity.MerchantReplyEntity;

public interface MerchantReplyDao {
	
	/**
	 * 保存商户回复
	 * @param merchantReplyEntity
	 * @return int
	 */
	@Insert("insert into pc_hp_merchantreply(mr_commentId,mr_commentTime,mr_commentContent) values(#{commentId},#{commentTime},#{commentContent})")
	public int saveBusinessReply(MerchantReplyEntity merchantReplyEntity);
}
