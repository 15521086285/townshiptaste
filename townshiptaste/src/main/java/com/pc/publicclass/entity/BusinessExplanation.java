package com.pc.publicclass.entity;
/**
 * 商家解释实体类
 * @author Administrator
 *
 */
public class BusinessExplanation {
	private int id;  //商家解释ID
	private String explanationContext;//解释内容
	private int commentsId; // 所解释的评论的id
	private String explanationTime;//解释时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExplanationContext() {
		return explanationContext;
	}
	public void setExplanationContext(String explanationContext) {
		this.explanationContext = explanationContext;
	}
	public int getCommentsId() {
		return commentsId;
	}
	public void setCommentsId(int commentsId) {
		this.commentsId = commentsId;
	}
	public String getExplanationTime() {
		return explanationTime;
	}
	public void setExplanationTime(String explanationTime) {
		this.explanationTime = explanationTime;
	}
	
}
