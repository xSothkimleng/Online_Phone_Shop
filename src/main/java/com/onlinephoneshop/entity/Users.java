package com.onlinephoneshop.entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity						// show that this is a model 
@Table(name = "tbl_user")	// show that this entity is belong to tbl_user 
public class Users {	
	@Id
	@Column(name = "user_id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "full_name")
	private String fullName;
	// constructor 
	public Users() {}
	public Users(String email, String password, String fullName) {
		super();
		this.email = email;
		this.password = password;
		this.fullName = fullName;
	}
	// getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
