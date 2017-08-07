package com.pc.homepage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.ProductReviewsDao;
import com.pc.homepage.entity.ProductReviewsEntity;
import com.pc.homepage.service.ProductReviewsService;

@Service("productReviewsService")
public class ProductReviewsServiceImpl implements ProductReviewsService{

	@Autowired
	private ProductReviewsDao productReviewsDao;
	
	public int saveComment(ProductReviewsEntity productReviewsEntity) {
		int i = productReviewsDao.saveComment(productReviewsEntity);
		return i;
	}

	public List<ProductReviewsEntity> getProductReviewsList(int commodityId,int pageNumber, int pageSize) {
		pageNumber = (pageNumber-1)*pageSize;
		List<ProductReviewsEntity> list = productReviewsDao.getProductReviewsList(commodityId, pageSize, pageSize);
		return list;
	}

	
	public int getTotal(int commodityId,int pageSize) {
		int total = productReviewsDao.getTotal(commodityId);
		int pageNumber = total/pageSize;
		if(total%pageSize > 0){
			pageNumber++;
		}
		return pageNumber;
	}

}
