package com.pc.homepage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.CommodityCategoriesDao;
import com.pc.homepage.dao.FeaturesDao;
import com.pc.homepage.entity.CommodityCategories;
import com.pc.homepage.entity.FeaturesEntity;
import com.pc.homepage.service.HomePageNavigationService;

@Service("homePageNavigationService")
public class HomePageNavigationServiceImpl implements HomePageNavigationService{
	
	@Autowired
	private CommodityCategoriesDao commodityCategoriesDao;
	@Autowired
	private FeaturesDao featuresDao;
	public List<CommodityCategories> getCommodityCategories() {
		List<CommodityCategories> list = commodityCategoriesDao.getCommodityCategories();
		return list;
	}

	
	public List<FeaturesEntity> getFeaturesEntity() {
		List<FeaturesEntity> list = featuresDao.getFeaturesEntitys();
		return list;
	}
	
}
