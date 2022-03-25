package com.lti.home.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminlogin7")
public class Adminlogin {
	@Id
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	
	public Adminlogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Adminlogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}




	@Override
	public String toString() {
		return "AdminLogin [email=" + email + ", password=" + password + "]";
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
	
	
	

}
