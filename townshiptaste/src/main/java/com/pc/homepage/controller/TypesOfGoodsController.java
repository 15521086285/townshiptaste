package com.pc.homepage.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.pc.homepage.entity.TypesOfGoodsEntity;
import com.pc.homepage.service.TypesOfGoodsService;

/**
 * 商品种类控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/home/typesofgoods")
public class TypesOfGoodsController {
	
	@Resource
	private TypesOfGoodsService typesOfGoodsService;
	
	/**
	 * 根据大类id获取商品种类
	 * @param commodityCategoriesId 大类id
	 * @return list 返回商品种类集合
	 *
	 */
	@RequestMapping(method=RequestMethod.GET,value="/getTheProductCategory.html",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getTheProductCategory(@RequestParam("commodityCategoriesId") int commodityCategoriesId){
		JSONObject json = new JSONObject();
		List<TypesOfGoodsEntity> typesOfGoodsList = typesOfGoodsService.getTypesOfGoodsList(commodityCategoriesId);
		json.put("typesOfGoodsList", typesOfGoodsList);
		return json.toJSONString();

	}
	
	/**
	 * 添加商品种类
	 * @param categoryName   种类名称
	 * @param commodityCategoriesId  所属大类id
	 * @return int  1表示成功 0表示
	 */
	@RequestMapping(method=RequestMethod.GET,value="/addTypesOfGoods.html",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String addTypesOfGoods(@RequestParam("categoryName") String categoryName,@RequestParam("categoriesId") int commodityCategoriesId){
		TypesOfGoodsEntity typesOfGoodsEntity = new TypesOfGoodsEntity();
		JSONObject json = new JSONObject();
		typesOfGoodsEntity.setCategoryName(categoryName);
		typesOfGoodsEntity.setCommodityCategoriesId(commodityCategoriesId);
		int success = typesOfGoodsService.addTypesOfGoods(typesOfGoodsEntity);
		json.put("success", success);
		return json.toString();
	}

}

















