package com.pc.homepage.service;

import com.pc.homepage.entity.LikeEntity;

public interface LikeService {
	/**
	 * 修改点赞记录
	 * @param likeEntity
	 * @return int 1表示成功  0表示已经点赞过
	 */
	public int savePointsPoRemember(LikeEntity likeEntity);
	
	
}
