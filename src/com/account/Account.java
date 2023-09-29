package com.account;

public abstract class Account {
	String userName;
	String password;
	Staus AccountStatus;
	Person person;
	
	public  boolean resetPassword(String password) {
		return true;
		
	}
	

}
