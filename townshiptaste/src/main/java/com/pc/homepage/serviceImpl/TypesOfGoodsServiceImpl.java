package com.pc.homepage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.TypesOfGoodsDao;
import com.pc.homepage.entity.TypesOfGoodsEntity;
import com.pc.homepage.service.TypesOfGoodsService;

@Service("typesOfGoodsService")
public class TypesOfGoodsServiceImpl implements TypesOfGoodsService {
	
	@Autowired
	private TypesOfGoodsDao typesOfGoodsDao;
	
	public List<TypesOfGoodsEntity> getTypesOfGoodsList(int commodityCategoriesId) {
		List<TypesOfGoodsEntity> list = typesOfGoodsDao.getTypesOfGoodsList(commodityCategoriesId);
		return list;
	}

	public int addTypesOfGoods(TypesOfGoodsEntity typesOfGoodsEntity) {
		int i = typesOfGoodsDao.addTypesOfGoods(typesOfGoodsEntity);
		return i;
	}

}
