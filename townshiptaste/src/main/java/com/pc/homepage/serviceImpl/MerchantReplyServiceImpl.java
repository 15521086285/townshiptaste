package com.pc.homepage.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.MerchantReplyDao;
import com.pc.homepage.entity.MerchantReplyEntity;
import com.pc.homepage.service.MerchantReplyService;

@Service("merchantReplyService")
public class MerchantReplyServiceImpl implements MerchantReplyService {
	
	@Autowired
	private MerchantReplyDao merchantReplyDao;
	
	public int saveBusinessReply(MerchantReplyEntity merchantReplyEntity) {
		int i = merchantReplyDao.saveBusinessReply(merchantReplyEntity);
		return i;
	}

}
