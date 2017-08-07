package com.pc.homepage.entity;
/**
 * 商品种类entity
 * @author Administrator
 *
 */
public class TypesOfGoodsEntity {
	private int id;//商品种类ID
	private String categoryName;//商品种类名称
	private int commodityCategoriesId;//商品大类id
	
	public TypesOfGoodsEntity() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setCommodityCategoriesId(int commodityCategoriesId) {
		this.commodityCategoriesId = commodityCategoriesId;
	}
	public int getId() {
		return id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public int getCommodityCategoriesId() {
		return commodityCategoriesId;
	}
}
