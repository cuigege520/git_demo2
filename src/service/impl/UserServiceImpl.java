package service.impl;

import java.util.List;

import dao.UserDao;
import daos.SmbmsUserDao;
import entity.SmbmsUser;
import service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	private SmbmsUserDao smbmsUserDao;
	
	
	@Override
	public List<String> query() {
		
		List<SmbmsUser> list = smbmsUserDao.query();
		
		System.out.println(list.size());
		
		return null;
	}
	
	@Override
	public void saveUser(String name, String pwd) {
		//System.out.println("开始-UserServiceImpl-saveUser:参数是:"+name+"\t"+pwd);
		
		//DAO层
		userDao.addUser(name, pwd);
		
		//System.out.println("结束-UserServiceImpl-saveUser:返回参数是:0");
//		return 0;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public SmbmsUserDao getSmbmsUserDao() {
		return smbmsUserDao;
	}

	public void setSmbmsUserDao(SmbmsUserDao smbmsUserDao) {
		this.smbmsUserDao = smbmsUserDao;
	}
	

}
