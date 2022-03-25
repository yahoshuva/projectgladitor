package com.lti.home.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.home.pojo.Applicationdoc;
@Repository
public class ApplicationImpl implements ApplicationinterfaceDAO
{
	@Autowired
	EntityManager eMan;


	@Override
	public boolean addApplication(Applicationdoc app) {
		eMan.persist(app);
		return true;
		
	}

	@Override
	public List<Applicationdoc> getApplications() {
		return eMan.createQuery("from Applicationdoc").getResultList();
	}

}



	

	
