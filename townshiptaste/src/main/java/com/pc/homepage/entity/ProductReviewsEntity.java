package com.pc.homepage.entity;
/**
 * 评论实体类
 * @author Administrator
 *
 */
public class ProductReviewsEntity {
	private int id;           //评论id
	private int userId;       //评论者id
	private int oderNumber;   //订单号
	private int commodityId;  //商品id
	private String commentTime; //评论时间
	private String commenContent; //评论内容
	private String imagePath; //评论图片路径
	private int merchandiseCompliance;//商品符合度
	private int storeAttitude;//店家态度
	private int logisticsSpeed;//物流速度
	private int dispatcherAttitude;//配送员态度
	private int likeNumber;   //点赞数量
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOderNumber() {
		return oderNumber;
	}
	public void setOderNumber(int oderNumber) {
		this.oderNumber = oderNumber;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommenContent() {
		return commenContent;
	}
	public void setCommenContent(String commenContent) {
		this.commenContent = commenContent;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public int getLikeNumber() {
		return likeNumber;
	}
	public void setLikeNumber(int likeNumber) {
		this.likeNumber = likeNumber;
	}
	public int getMerchandiseCompliance() {
		return merchandiseCompliance;
	}
	public void setMerchandiseCompliance(int merchandiseCompliance) {
		this.merchandiseCompliance = merchandiseCompliance;
	}
	public int getStoreAttitude() {
		return storeAttitude;
	}
	public void setStoreAttitude(int storeAttitude) {
		this.storeAttitude = storeAttitude;
	}
	public int getLogisticsSpeed() {
		return logisticsSpeed;
	}
	public void setLogisticsSpeed(int logisticsSpeed) {
		this.logisticsSpeed = logisticsSpeed;
	}
	public int getDispatcherAttitude() {
		return dispatcherAttitude;
	}
	public void setDispatcherAttitude(int dispatcherAttitude) {
		this.dispatcherAttitude = dispatcherAttitude;
	}
	public int getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}
}
