package service;

import java.util.List;

public interface UserService {
	public void saveUser(String name,String pwd);
	
	public List<String> query();
}
