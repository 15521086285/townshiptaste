package com.pc.homepage.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.pc.homepage.entity.CommodityEntity;
import com.pc.homepage.entity.ProductReviewsEntity;
import com.pc.homepage.service.CommodityService;
import com.pc.homepage.service.ProductReviewsService;
/**
 * 商品控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/home/commodity")
public class CommodityController {
	
	@Resource
	private CommodityService commodityService;
	@Resource
	private ProductReviewsService productReviewsService;
	
	/**
	 * 根据商品种类查询所有商品
	 * @param commodityCategoriesId 商品种类id
	 * @param pageNumber 当前页数
	 * @return list  返回commodity集合
	 */
	@RequestMapping(method=RequestMethod.GET,value="/getCommodityList.html",produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getCommodityList(@RequestParam("typesOfGoodsEntityId") int typesOfGoodsEntityId,@RequestParam("pageNumber") int pageNumber){
		JSONObject json = new JSONObject();
		int pageSize = 8;
		List<CommodityEntity> commodityList = commodityService.getCommodityList(typesOfGoodsEntityId, pageNumber, pageSize);
		int total = commodityService.getTotal(typesOfGoodsEntityId,pageSize);
		json.put("commodityList", commodityList);
		json.put("total", total);
		return json.toJSONString();
	}
	
	/**
	 * 添加商品
	 * @param price  商品价格
	 * @param introduction  商品简介
	 * @param address       商品地址
	 * @param shopId        商店id
	 * @param typesOfGoodsEntityId   种类id
	 * @return int 是否添加成功
	 */
	@RequestMapping(value="/addGoods.html",method=RequestMethod.GET,produces="text/html;charset=UTF-8")
	@ResponseBody
	public String addGoods(@RequestParam("price") int price,@RequestParam("introduction") String introduction,
			@RequestParam("address") String address,@RequestParam("shopId") int shopId,@RequestParam("tg_entityId") int typesOfGoodsEntityId){
		CommodityEntity commodityEntity = new CommodityEntity();
		JSONObject json = new JSONObject();
		commodityEntity.setPrice(price);
		commodityEntity.setProductDescription(introduction);
		commodityEntity.setSourceAddress(address);
		commodityEntity.setShopId(shopId);
		commodityEntity.setTypesOfGoodsEntityId(typesOfGoodsEntityId);
		int success = commodityService.addingGoods(commodityEntity);
		json.put("success", success);
		return json.toString();
	}
	
	/**
	 * 删除商品
	 * @return int 是否成功
	 */
	@RequestMapping("/removeGoods.html")
	@ResponseBody
	public String removeGoods(@RequestParam("goodsId") int id){
		JSONObject json = new JSONObject();
		int success = commodityService.removeGoods(id);
		json.put("success", success);
		return json.toString();
	}
	
	/**
	 * 更新商品
	 * @param id  商品id
	 * @param price   		      商品价格
	 * @param introduction    商品简介
	 * @param sourceAddress   商品地址
	 * @return int 是否更新成功
	 */
	@RequestMapping(method=RequestMethod.GET,value="/modifyGoods.html",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String modifyGoods(@RequestParam("cid") int id,@RequestParam("price") double price,
			@RequestParam("introduction") String introduction,@RequestParam("address") String sourceAddress){
		System.out.println("更新控制器");
		CommodityEntity commodityEntity = new CommodityEntity();
		commodityEntity.setId(id);
		commodityEntity.setProductDescription(introduction);
		commodityEntity.setPrice(price);
		commodityEntity.setSourceAddress(sourceAddress);
		JSONObject json = new JSONObject();
		int success = commodityService.modifyGoods(commodityEntity);
		json.put("success", success);
		return json.toString();
	}
	
	/**
	 * 商品上下架
	 * @param whetherShelves  商品上下架状态码
	 * @return int   操作是否成功
	 */
	@RequestMapping(method=RequestMethod.GET,value="/onTheShelf.html",produces="text/html;chaset=UTF-8")
	@ResponseBody
	public String onTheShelf(@RequestParam("whetherShelves") int whetherShelves){
		JSONObject json = new JSONObject();
		int success = commodityService.onTheShelf(whetherShelves);
		json.put("success", success);
		return json.toString();
	}
	/**
	 * 获取商品评论
	 * @param commodityId  商品id
	 * @param pageNumber   当前页码
	 * @return list   评论集合
	 */
	public String getProductReviews(@RequestParam("commodityId") int commodityId,@RequestParam("pageNumber") int pageNumber){
		int pageSize = 10;
		List<ProductReviewsEntity> list = productReviewsService.getProductReviewsList(commodityId, pageNumber, pageSize);
		int total = productReviewsService.getTotal(commodityId, pageSize);
		JSONObject json = new JSONObject();
		json.put("total", total);
		json.put("list", list);
		return json.toString();
	}
	
}
























