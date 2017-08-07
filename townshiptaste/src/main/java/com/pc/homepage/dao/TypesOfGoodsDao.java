package com.pc.homepage.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.pc.homepage.entity.TypesOfGoodsEntity;

public interface TypesOfGoodsDao {
	/**
	 * 获取商品种类集合
	 * @return list 商品种类list
	 */
	@Select("select * from pc_hp_typesofgoods where tog_commodityCategoriesId=#{commodityCategoriesId}")
	@ResultMap("TypesOfGoodsMapper")
	public List<TypesOfGoodsEntity> getTypesOfGoodsList(int commodityCategoriesId);
	
	@Select("insert into pc_hp_typesofgoods(tog_categoryName,tog_commodityCategoriesId) values(#{categoryName},#{commodityCategoriesId})")
	public int addTypesOfGoods(TypesOfGoodsEntity typesOfGoodsEntity);
}
