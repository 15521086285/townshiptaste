package com.pc.usersystem.entity;

/**
 * @describe 用户信息实体类
 */
public class Userinfo {
	
	private int id; 
	private String userName; //用户账号
	private String passWord; //用户密码
	private String cellPhoneNumber; //手机号码
	private String email;   //邮箱
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Userinfo [userName=" + userName + ", passWord=" + passWord
				+ ", cellPhoneNumber=" + cellPhoneNumber + ", email=" + email
				+ "]";
	}
	
	
	
}
