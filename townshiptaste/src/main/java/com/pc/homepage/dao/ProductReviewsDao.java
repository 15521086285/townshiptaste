package com.pc.homepage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pc.homepage.entity.ProductReviewsEntity;

/**
 * 评论dao
 * @author Administrator
 *
 */
public interface ProductReviewsDao {
	/**
	 * 保存评论
	 * @param productReviewsEntity  评论实体类
	 * @return int 是否保存成功
	 */
	@Insert("insert into pc_hp_productreviewsentity(pr_userId,pr_commodityId,pr_oderNumber,pr_commentTime,pr_commenContent,pr_imagePath,"+
			"pr_merchandiseCompliance,pr_storeAttitude,pr_logisticsSpeed,pr_dispatcherAttitude)"+
	 " values(#{userId},#{oderNumber},#{commentTime},#{commenContent},#{imagePath},#{merchandiseCompliance},#{storeAttitude},#{logisticsSpeed},#{dispatcherAttitude})")
	public int saveComment(ProductReviewsEntity productReviewsEntity);
	
	/**
	 * 点赞加一
	 * @param commentId  评论id
	 */
	@Update("Update pc_hp_productreviewsentity set pr_likeNumber=(select count(*) from pc_hp_like where l_commentId=#{commentId}) where pr_id=#{commentId}")
	public void pointPlus0ne(@Param("commentId") int commentId);
	
	/**
	 * 查询商品评论
	 * @param commodityId 商品id
	 * @param pageNumber  当前页码
	 * @param pageSize    每页显示多少条记录
	 * @return list  评论集合
	 */
	@Select("select * from pc_hp_productreviewsentity where pr_commodityId=#{commodityId} limit #{pageNumber},#{pageSize}")
	public List<ProductReviewsEntity> getProductReviewsList(@Param("commodityId") int commodityId,@Param("pageNumber")int pageNumber,@Param("pageSize") int pageSize);
	
	/**
	 * 查询商品的评论总数
	 * @param commodityId
	 * @return  int  评论总数
	 */
	@Select("select count(*) from pc_hp_productreviewsentity where pr_commodityId=#{commodityId}")
	public int getTotal(@Param("commodityId") int commodityId);
}



















