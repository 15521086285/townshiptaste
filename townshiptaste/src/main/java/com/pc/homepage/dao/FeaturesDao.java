package com.pc.homepage.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.pc.homepage.entity.FeaturesEntity;
/**
 * 功能模块dao
 * @author Administrator
 *
 */
public interface FeaturesDao {
	/**
	 * 获取功能模块
	 * @return
	 */
	@Select("select * from pc_hp_features")
	@ResultMap("FeaturesEntityMapper")
	public List<FeaturesEntity> getFeaturesEntitys();
}
