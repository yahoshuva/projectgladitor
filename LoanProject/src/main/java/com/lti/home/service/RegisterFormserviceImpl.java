package com.lti.home.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.home.dao.RegisterFormDAO;
import com.lti.home.pojo.CustomerRegister;
@Service
@Transactional
public class RegisterFormserviceImpl implements RegisterFormInterfaceservice{

	
	@Autowired
	RegisterFormDAO rdao;
	@Override
	public boolean addloan(CustomerRegister  cr) {
		
		return rdao.addloan(cr);
	}

	@Override
	public List<CustomerRegister> getloan() {
		
		return rdao.getloan();
	}

	@Override
	public boolean validateLogin(String email, String password) {
		
		return rdao.validateLogin(email,password);
	}

	@Override
	public boolean adminvalidateLogin(String email, String password) {
		
		return rdao.adminvalidateLogin(email, password);
	}


@Override
public List<CustomerRegister> searchUser(String email) {
	
	return rdao.searchUser(email);
}

@Override
public List<CustomerRegister> searchAdmin(int userid) {
	
	return rdao.searchAdmin(userid);
}
}