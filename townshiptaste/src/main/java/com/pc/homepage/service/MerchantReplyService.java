package com.pc.homepage.service;

import org.springframework.stereotype.Service;

import com.pc.homepage.entity.MerchantReplyEntity;

@Service("merchantReplyService")
public interface MerchantReplyService {
	/**
	 * 保存商户回复
	 * @param merchantReplyEntity
	 * @return int 
	 */
	public int saveBusinessReply(MerchantReplyEntity merchantReplyEntity);

}
