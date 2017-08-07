package com.pc.homepage.entity;
/**
 * 追评实体类
 * @author Administrator
 *
 */
public class ToPursueEntity {
	
	private int id; //追评id
	private int commentId; //评论id
	private String toPursueTime; //追评时间
	private String toPursueContent;//追评内容
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
	public String getToPursueTime() {
		return toPursueTime;
	}
	public void setToPursueTime(String toPursueTime) {
		this.toPursueTime = toPursueTime;
	}
	public String getToPursueContent() {
		return toPursueContent;
	}
	public void setToPursueContent(String toPursueContent) {
		this.toPursueContent = toPursueContent;
	}
	
}
