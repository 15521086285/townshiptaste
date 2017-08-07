package com.pc.publicclass.entity;
/**
 * 商品评论实体类
 * @author Administrator
 *
 */
public class CommodityComment {
	private int id; //评论ID
	private String commentById; //评论者id
	private String comments; //评论内容
	private String additionalComments; //追加评论
	private String commentsTime; //评论时间
	private String additionalCommentsTime; //追加评论时间
	private int commodityId; //商品ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommentById() {
		return commentById;
	}
	public void setCommentById(String commentById) {
		this.commentById = commentById;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getAdditionalComments() {
		return additionalComments;
	}
	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}
	public String getCommentsTime() {
		return commentsTime;
	}
	public void setCommentsTime(String commentsTime) {
		this.commentsTime = commentsTime;
	}
	public String getAdditionalCommentsTime() {
		return additionalCommentsTime;
	}
	public void setAdditionalCommentsTime(String additionalCommentsTime) {
		this.additionalCommentsTime = additionalCommentsTime;
	}
	public int getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}
}
