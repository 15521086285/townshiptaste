package com.pc.homepage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.CommodityDao;
import com.pc.homepage.entity.CommodityEntity;
import com.pc.homepage.service.CommodityService;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityService{
	
	@Autowired
	private CommodityDao commodityDao;
	
	public List<CommodityEntity> getCommodityList(int typesOfGoodsEntityId,int pageNumber, int pageSize) {
		pageSize = 8;
//		if(pageNumber < 1){
//			pageNumber = 1;
//		}
		pageNumber = (pageNumber-1)*pageSize;
		List<CommodityEntity> list = commodityDao.getCommodityList(typesOfGoodsEntityId, pageNumber, pageSize);
		return list;
	}
	
	public int getTotal(int typesOfGoodsEntityId,int pageSize) {
		int total = commodityDao.getTotal(typesOfGoodsEntityId);
		int pageNumber = total/pageSize;
		if(total%pageSize > 0){
			pageNumber++;
		}
		return pageNumber;
	}

	public int addingGoods(CommodityEntity commodityEntity) {
		int i = commodityDao.addingGoods(commodityEntity);
		return i;
	}

	public int removeGoods(int id) {
		int i = commodityDao.removeGoods(id);
		return i;
	}

	
	public int modifyGoods(CommodityEntity commodityEntity) {
		int i = commodityDao.modifyGoods(commodityEntity);
		return i;
	}

	public int onTheShelf(int whetherShelves) {
		int i = commodityDao.onTheShelf(whetherShelves);
		return i;
	}

}
