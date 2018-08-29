package entity;

import java.util.Date;

public class SmbmsUser {
	private int id;
	private String userName;
	private String userPassword;
	private String phone;
	private Date birthday; 
	private Date creationDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	public SmbmsRole getSmbmsRole() {
//		return smbmsRole;
//	}
//	public void setSmbmsRole(SmbmsRole smbmsRole) {
//		this.smbmsRole = smbmsRole;
//	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
