package com.pc.homepage.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pc.homepage.entity.ProductReviewsEntity;

/**
 * 评论service
 * @author Administrator
 *
 */
public interface ProductReviewsService {
	/**
	 * 保存评论
	 * @param productReviewsEntity
	 * @return int
	 */
	public int saveComment(ProductReviewsEntity productReviewsEntity);
	/**
	 * 获取商品评论
	 * @param commodityId
	 * @return list 商品评论集合
	 */
	public List<ProductReviewsEntity> getProductReviewsList(int commodityId,int pageNumber,int pageSize);
	
	/**
	 * 获取当前页数
	 * @param commodityId 商品id
	 * @param pageSize    煤业显示的记录数
	 * @return int  页数
	 */
	public int getTotal(int commodityId,int pageSize);
	
		
}
