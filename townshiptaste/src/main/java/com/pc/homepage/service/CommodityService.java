package com.pc.homepage.service;

import java.util.List;

import com.pc.homepage.entity.CommodityEntity;
/**
 * 商品service
 * @author Administrator
 *
 */
public interface CommodityService {
	/**
	 * 根据 commodityCategoriesId获取所有商品信息
	 * @param commodityCategoriesId （商品大类id）
	 * @return list 返回商品信息集合
	 */
	public List<CommodityEntity> getCommodityList(int typesOfGoodsEntityId,int pageNumber,int pageSize);
	
	/**
	 * 查询商品总数
	 * @param typesOfGoodsEntityId 商品种类id
	 * @return int  商品记录数
	 */
	public int getTotal(int typesOfGoodsEntityId,int pageSize);
	
	/**
	 * 添加商品
	 * @param commodityEntity 商品实体类
	 * @return int  是否添加成功
	 */
	public int addingGoods(CommodityEntity commodityEntity);
	
	/**
	 * 删除商品
	 * @return int 是否成功
	 */
	public int removeGoods(int id);
	
	/**
	 * 修改商品信息
	 * @param commodityEntity
	 * @return
	 */
	public int modifyGoods(CommodityEntity commodityEntity);
	
	/**
	 * 商品上架或者下架
	 * @param whetherShelves
	 * @return int 是否上下架成功
	 */
	public int onTheShelf(int whetherShelves);
}
