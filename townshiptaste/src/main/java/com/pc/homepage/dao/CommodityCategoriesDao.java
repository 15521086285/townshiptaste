package com.pc.homepage.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.pc.homepage.entity.CommodityCategories;

/**
 * 商品大类DAO
 * @author Administrator
 *
 */
public interface CommodityCategoriesDao {
	/**
	 * 获取商品大类
	 * @return list 返回商品大类集合
	 */
	@Select("select * from pc_hp_commoditycategories")
	@ResultMap("commodityCategoriesMapper")
	public List<CommodityCategories> getCommodityCategories();
}
