package com.pc.usersystem.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.publicclass.util.encryption.SHAEncrypt;
import com.pc.usersystem.dao.RegisterDao;
import com.pc.usersystem.entity.Userinfo;
import com.pc.usersystem.service.RegisterService;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired	
	private RegisterDao registerDao;
	
	public boolean saveRegistrationInformation(Userinfo userinfo) {
		/*对密码加密*/
		String pwd = new SHAEncrypt().encryptPwd(userinfo.getPassWord());
		userinfo.setPassWord(pwd);
		int i = registerDao.saveRegistrationInformation(userinfo);
		boolean success = false;
		if(i != 0){
			success = true;
		}
		return success;
	}
	
	public boolean accountRepeat(String userName) {
		Userinfo userinfo = registerDao.queryUserinfoOnTheUsername(userName);
		boolean success = false;
		if(userinfo == null){
			success = true;
		}
		return success;
	}

	
	public boolean thePhoneAlreadyExists(String cellPhoneNumber) {
		Userinfo userinfo = registerDao.queryUserinfoOnThePhong(cellPhoneNumber);
		boolean success = false;
		if(userinfo == null){
			success = true;
		}
		return success;
	}
	

}
