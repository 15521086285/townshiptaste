package com.pc.homepage.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.LikeDao;
import com.pc.homepage.dao.ProductReviewsDao;
import com.pc.homepage.entity.LikeEntity;
import com.pc.homepage.service.LikeService;

@Service("likeService")
public class LikeServiceImpl implements LikeService {
	
	@Autowired
	private LikeDao likeDao;
	@Autowired
	private ProductReviewsDao productReviewsDao;
	
	public int savePointsPoRemember(LikeEntity likeEntity) {
		LikeEntity likePojo = likeDao.selectPointsPoRemember(likeEntity.getUserId(), likeEntity.getCommentId());
		int i = 0;
		if(likePojo == null){
			i = likeDao.insertPointsPoRemember(likeEntity);
			if(i != 0){
				productReviewsDao.pointPlus0ne(likeEntity.getCommentId());
			}
		}
		return i;
	}

}
