package com.pc.homepage.entity;
/**
 * 首页轮播图
 * @author Administrator
 *
 */
public class HomeCarouselEntity {
	private int id;   //图片id
	private String imagePath; //图片路径
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
