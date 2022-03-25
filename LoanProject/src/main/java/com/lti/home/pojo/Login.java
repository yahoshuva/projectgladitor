package com.lti.home.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login7")
public class Login {
	
	@Id
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	
	public Login() {
		super();
		
	}


	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
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
