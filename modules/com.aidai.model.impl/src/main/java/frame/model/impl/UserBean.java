package frame.model.impl;

import java.io.Serializable;

import frame.model.IUser;

public class UserBean implements IUser,Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String password;
	
	public UserBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
