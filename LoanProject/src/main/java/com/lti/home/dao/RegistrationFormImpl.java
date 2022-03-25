package com.lti.home.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.home.pojo.CustomerRegister;
import com.lti.home.pojo.Login;


@Repository
public class RegistrationFormImpl implements RegisterFormDAO {
	
	@Autowired
	
	EntityManager eMan;

	@Override
	public boolean addloan(CustomerRegister cust) {
		eMan.persist(cust);
		Login lg=new Login();
		lg.setEmail(cust.getEmail());
		lg.setPassword(cust.getPassword());
		eMan.persist(lg);
		return true;
	
	}

	@Override
	public List<CustomerRegister> getloan() {
		
		return eMan.createQuery("from CustomerRegister").getResultList();
	}
	@Override
	public boolean validateLogin(String email, String password) {
		
		Query qry2=eMan.createQuery("from Login log where log.email =?1 and log.password=?2");
		qry2.setParameter(1,email);
		qry2.setParameter(2,password);		
		List<Login> users=qry2.getResultList();		
			if(users.size()>0)
			return true;
			else
			return false;
	}

	@Override
	public boolean adminvalidateLogin(String email, String password) {
		Query qry2=eMan.createQuery("from Adminlogin log where log.email =?1 and log.password=?2");
		qry2.setParameter(1,email);
		qry2.setParameter(2,password);		
		List<Login> users=qry2.getResultList();		
			if(users.size()>0)
			return true;
			else
	
		
		return false;
	}

@Override
public List<CustomerRegister> searchUser(String email) {
	Query qry2=eMan.createQuery("from CustomerRegister v where v.email=?1");
	qry2.setParameter(1,email);
	List<CustomerRegister> res=qry2.getResultList();
	return res;
	
}

@Override
public List<CustomerRegister> searchAdmin(int userid) {
	Query qry2=eMan.createQuery("from CustomerRegister v where v.userid=?1");
	qry2.setParameter(1,userid);
	List<CustomerRegister> res=qry2.getResultList();
	return res;
	
}




}