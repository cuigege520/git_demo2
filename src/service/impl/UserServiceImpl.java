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
		//System.out.println("��ʼ-UserServiceImpl-saveUser:������:"+name+"\t"+pwd);
		
		//DAO��
		userDao.addUser(name, pwd);
		
		//System.out.println("����-UserServiceImpl-saveUser:���ز�����:0");
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
