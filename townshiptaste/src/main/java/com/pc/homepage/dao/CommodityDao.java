package com.pc.homepage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.pc.homepage.entity.CommodityEntity;

/**
 * 商品dao
 * @author Administrator
 *
 */
public interface CommodityDao {
	
	/**
	 * 根据商品大类ID获取所有商品信息
	 * @param commodityCategoriesId  商品大类id
	 * @return list 商品信息集合
	 */
	@Select("select * from pc_hp_commodity where cp_typesOfGoodsEntityId=#{typesOfGoodsEntityId} and cp_whetherShelves=1 limit #{pageNumber},#{pageSize}")
	@ResultMap("commodityMapper")
	public List<CommodityEntity> getCommodityList(@Param("typesOfGoodsEntityId")int typesOfGoodsEntityId,@Param("pageNumber")int pageNumber,@Param("pageSize")int pageSize);
	
	/**
	 * 根据商品种类id查询商品数量
	 * @param commodityCategoriesId
	 * @return
	 */
	@Select("select count(*) from pc_hp_commodity where cp_typesOfGoodsEntityId=#{commodityCategoriesId} and cp_whetherShelves=1")
	public int getTotal(int commodityCategoriesId);
	
	/**
	 * 添加 商品
	 * @param commodityEntity 商品所属种类id
	 * @return int  是否添加成功
	 */
	@Insert("insert into pc_hp_commodity(cp_price,cp_productDescription,cp_sourceAddress,cp_commentId,cp_shopId,cp_imagePath,cp_typesOfGoodsEntityId)"+
			"values(#{cp_price},#{cp_productDescription},#{cp_sourceAddress},#{cp_commentId},#{cp_shopId},"+
			"#{cp_imagePath},#{cp_typesOfGoodsEntityId})")
	public int addingGoods(CommodityEntity commodityEntity);
	
	/**
	 * 删除商品
	 * @param id  商品id
	 * @return int 是否删除成功
	 */
	@Delete("delete from pc_hp_commodity where cp_id=#{id}")
	public int removeGoods(int id);
	
	
	/**
	 * 修改商品信息
	 * @return int 是否修改成功
	 */	
	public int modifyGoods(CommodityEntity commodityEntity);
	
	/**
	 * 修改商品上下架状态
	 * @return int 是否修改成功
	 */
	public int onTheShelf(int whetherShelves);
	
}










