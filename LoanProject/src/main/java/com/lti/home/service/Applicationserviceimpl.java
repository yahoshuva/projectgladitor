package com.lti.home.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.lti.home.dao.ApplicationinterfaceDAO;
import com.lti.home.pojo.Applicationdoc;

@Service
@Transactional
public class Applicationserviceimpl implements Applicationservice
{

	@Autowired
	ApplicationinterfaceDAO adao;

	@Override
	public boolean addApplication(Applicationdoc app) {
		return adao.addApplication(app);
		
	}

	@Override
	public List<Applicationdoc> getApplications() {
		
		return adao.getApplications();
		
	}

}
	
	

	
