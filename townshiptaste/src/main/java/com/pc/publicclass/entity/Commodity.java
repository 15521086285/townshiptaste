package com.pc.publicclass.entity;
/**
 * 商品信息实体类
 * @author Administrator
 *
 */
public class Commodity {
	private int id; //商品Id
	private String commodityNmae; //商品名称
	private double commodityPrice;//商品价格
	private String commodityAddress;//商品详细地址
	private String commodityIntroduction; //商品介绍
	private int commodtyInventory; //商品库存
	private int monthSales;  //当月销量
	private int totalSales;  //总销量
	private int whetherShelves; //是否上架 1表示上架 0表示下架
	private int storeId;     //商店Id
	private int ownerId;     //店主Id
	public int getCommodityImagePath() {
		return commodityImagePath;
	}
	public void setCommodityImagePath(int commodityImagePath) {
		this.commodityImagePath = commodityImagePath;
	}
	private int commodityImagePath; //图片路径
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommodityNmae() {
		return commodityNmae;
	}
	public void setCommodityNmae(String commodityNmae) {
		this.commodityNmae = commodityNmae;
	}
	public double getCommodityPrice() {
		return commodityPrice;
	}
	public void setCommodityPrice(double commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	public String getCommodityAddress() {
		return commodityAddress;
	}
	public void setCommodityAddress(String commodityAddress) {
		this.commodityAddress = commodityAddress;
	}
	public String getCommodityIntroduction() {
		return commodityIntroduction;
	}
	public void setCommodityIntroduction(String commodityIntroduction) {
		this.commodityIntroduction = commodityIntroduction;
	}
	public int getCommodtyInventory() {
		return commodtyInventory;
	}
	public void setCommodtyInventory(int commodtyInventory) {
		this.commodtyInventory = commodtyInventory;
	}
	public int getMonthSales() {
		return monthSales;
	}
	public void setMonthSales(int monthSales) {
		this.monthSales = monthSales;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public int getWhetherShelves() {
		return whetherShelves;
	}
	public void setWhetherShelves(int whetherShelves) {
		this.whetherShelves = whetherShelves;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
}
