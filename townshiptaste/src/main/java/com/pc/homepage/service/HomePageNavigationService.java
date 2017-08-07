package com.pc.homepage.service;

import java.util.List;

import com.pc.homepage.entity.CommodityCategories;
import com.pc.homepage.entity.FeaturesEntity;

/**
 * 主页导航service 
 * @author Administrator
 *
 */
public interface HomePageNavigationService {
	/**
	 * 获取商品大类
	 * @return list 返回商品大类集合
	 */
	public List<CommodityCategories> getCommodityCategories();
	/**
	 * 获取网站功能模块
	 * @return list 返回网站功能模块
	 */
	public List<FeaturesEntity> getFeaturesEntity();
	
}
