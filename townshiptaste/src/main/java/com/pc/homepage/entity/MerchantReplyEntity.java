package com.pc.homepage.entity;

/**
 * 商户回复实体类
 * @author Administrator
 *
 */
public class MerchantReplyEntity {
	private int id; //回复id
	private int commentId;     //产品评论id
	private String commentTime;//评论时间
	private	String commentContent;//回复内容
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	
}
