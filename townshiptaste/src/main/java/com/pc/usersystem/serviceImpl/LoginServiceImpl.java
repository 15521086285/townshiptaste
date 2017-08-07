package com.pc.usersystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.publicclass.util.encryption.SHAEncrypt;
import com.pc.usersystem.dao.LoginDao;
import com.pc.usersystem.entity.Userinfo;
import com.pc.usersystem.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
    
	@Autowired
	private LoginDao loginDao;
	public boolean loginToJudge(String userName, String passWord) {
		Userinfo userinfo = loginDao.getUserToTheUsernameAndPassword(userName);
		boolean success =false;
		if(userinfo != null){
			String encPwd = userinfo.getPassWord();
			success = new SHAEncrypt().validatePwd(passWord, encPwd);
		}
		return success;
	}
	
}
