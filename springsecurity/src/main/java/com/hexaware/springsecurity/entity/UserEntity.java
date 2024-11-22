package com.hexaware.springsecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Accounts")
public class UserEntity {
	@Id
	private long userId;
	private String username;
	private String password;
	public UserEntity() {
		super();
	}
	public UserEntity(long userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
	
}