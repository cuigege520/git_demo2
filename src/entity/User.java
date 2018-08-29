package entity;

import java.util.List;
import java.util.Set;

/**
 * 用户实体类
 */
public class User implements java.io.Serializable {
	private Integer id; // 用户ID
	private String username; // 用户名
	private Integer age; // 密码
	private String email; // 电子邮件
	private List hobbues;
	private Set hobbues1;

	// getter & setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List getHobbues() {
		return hobbues;
	}

	public void setHobbues(List hobbues) {
		this.hobbues = hobbues;
	}

	public Set getHobbues1() {
		return hobbues1;
	}

	public void setHobbues1(Set hobbues1) {
		this.hobbues1 = hobbues1;
	}

}
