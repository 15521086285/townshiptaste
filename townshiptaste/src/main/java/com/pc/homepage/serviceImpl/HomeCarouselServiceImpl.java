package com.pc.homepage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.homepage.dao.HomeCarouselDao;
import com.pc.homepage.entity.HomeCarouselEntity;
import com.pc.homepage.service.HomeCarouselService;
/**
 * 轮播图service
 * @author Administrator
 *
 */

@Service
public class HomeCarouselServiceImpl implements HomeCarouselService {
	
	@Autowired
	private HomeCarouselDao homeCarouselDao;
	public List<HomeCarouselEntity> getCarouselList() {
		List<HomeCarouselEntity> list = homeCarouselDao.getCarouselList();
		return list;
	}

}
