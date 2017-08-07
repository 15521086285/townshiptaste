package com.pc.homepage.entity;
/**
 * 商品信息
 * @author Administrator
 *
 */
public class CommodityEntity {
	private int id;       //商品ID
	private double price; //价格
	private String productDescription;//商品简介
	private String sourceAddress; //货源地址
	private int commentId; // 评论Id
	private int shopId; //店铺Id
	private String imagePath; //图片路径
	private int typesOfGoodsEntityId;//商品种类Id
	private int whetherShelves; // 上架与否
	
	
	public int getTypesOfGoodsEntityId() {
		return typesOfGoodsEntityId;
	}
	public void setTypesOfGoodsEntityId(int typesOfGoodsEntityId) {
		this.typesOfGoodsEntityId = typesOfGoodsEntityId;
	}	
	public CommodityEntity() {
		super();
	}
	public int getWhetherShelves() {
		return whetherShelves;
	}
	public void setWhetherShelves(int whetherShelves) {
		this.whetherShelves = whetherShelves;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
}
