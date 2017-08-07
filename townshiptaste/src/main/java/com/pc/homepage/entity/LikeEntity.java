package com.pc.homepage.entity;
/**
 * 点赞实体类
 * @author Administrator
 *
 */
public class LikeEntity {
	private int id;        //id
	private int userId;	   //点赞者用户id
	private int commentId; //评论id
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
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

}
