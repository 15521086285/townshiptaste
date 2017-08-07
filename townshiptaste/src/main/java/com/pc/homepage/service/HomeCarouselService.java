package com.pc.homepage.service;

import java.util.List;

import com.pc.homepage.entity.HomeCarouselEntity;


public interface HomeCarouselService {
	/**
	 * 获取首页所有轮播图
	 * @return
	 */
	public List<HomeCarouselEntity> getCarouselList();
}
