package com.pc.homepage.service;

import java.util.List;

import com.pc.homepage.entity.TypesOfGoodsEntity;
/**
 * 商品种类service
 * @author Administrator
 *
 */
public interface TypesOfGoodsService {
	/**
	 * 获取商品种类集合
	 * @return list 商品种类list
	 * 
	 */
	public List<TypesOfGoodsEntity> getTypesOfGoodsList(int commodityCategoriesId);
	
	/**
	 * 添加商品种类
	 * @param typesOfGoodsEntity
	 * @return
	 */
	public int addTypesOfGoods(TypesOfGoodsEntity typesOfGoodsEntity);
}
