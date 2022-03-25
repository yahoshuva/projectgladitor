package com.lti.home.dao;


import java.util.List;

import com.lti.home.pojo.CustomerRegister;





public interface RegisterFormDAO {

	public boolean addloan(CustomerRegister cust );
	public List<CustomerRegister> getloan();


	
		public boolean validateLogin(String email,String password);
		
		public boolean adminvalidateLogin(String email,String password);

public List<CustomerRegister> searchUser(String email);
		
		
		public List<CustomerRegister> searchAdmin(int userid);

}

