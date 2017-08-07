package com.pc.homepage.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.ToPursueDao;
import com.pc.homepage.entity.ToPursueEntity;
import com.pc.homepage.service.ToPursueService;

@Service("toPursueService")
public class ToPursueServiceImpl implements ToPursueService {
	
	@Autowired
	private ToPursueDao toPursueDao;
	public int saveTheReview(ToPursueEntity toPursueEntity) {
		int i = toPursueDao.saveTheReview(toPursueEntity);
		return i;
	}

}
