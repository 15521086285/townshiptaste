package com.pc.homepage.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.pc.homepage.entity.CommodityCategories;
import com.pc.homepage.entity.FeaturesEntity;
import com.pc.homepage.entity.HomeCarouselEntity;
import com.pc.homepage.service.HomeCarouselService;
import com.pc.homepage.service.HomePageNavigationService;

/**
 * 导航控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/homepage/navigation")
public class HomeNavigation {
	
	@Resource
	private HomePageNavigationService homePageNavigationService;
	@Resource
	private HomeCarouselService homeCarouselService;
	
	/**
	 * 获取导航项
	 * @return
	 */
	@RequestMapping(value="/getNavigation.html",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getNavigation(){
		JSONObject json = new JSONObject();
		System.out.println("homepage控制器");
		//商品大类
		List<CommodityCategories> categoriesList = homePageNavigationService.getCommodityCategories();
		//功能模块
		List<FeaturesEntity> featuresList = homePageNavigationService.getFeaturesEntity();
		//轮播图
		List<HomeCarouselEntity> carouselList = homeCarouselService.getCarouselList();
		json.put("categoriesList", categoriesList);
		json.put("featuresList", featuresList);
		json.put("carouselList", carouselList);
		return json.toJSONString();
	}
	
}

















