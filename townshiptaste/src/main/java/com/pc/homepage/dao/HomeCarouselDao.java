package com.pc.homepage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pc.homepage.entity.HomeCarouselEntity;

/**
 * 轮播图dao
 * @author Administrator
 *
 */
public interface HomeCarouselDao {
	
	/**
	 * 查询所有轮播图
	 * @return
	 */
	@Select("select * from pc_hp_carousel")
	public List<HomeCarouselEntity> getCarouselList();
}
