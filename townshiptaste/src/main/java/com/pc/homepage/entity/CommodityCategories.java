package com.pc.homepage.entity;

/**
 * 商品大类
 * @author Administrator
 *
 */
public class CommodityCategories {
	private int id; // 商品大类Id
	private String categorieName; // 商品大类名称
	private int featuresId;//模块id
	public CommodityCategories() {
		super();
	}
	public int getId() {
		return id;
	}
	public int getFeaturesId() {
		return featuresId;
	}
	public void setFeaturesId(int featuresId) {
		this.featuresId = featuresId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategorieName() {
		return categorieName;
	}
	
	public void setCategorieName(String categorieName) {
		this.categorieName = categorieName;
	}
	
}
