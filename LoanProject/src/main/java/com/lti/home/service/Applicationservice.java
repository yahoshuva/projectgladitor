package com.lti.home.service;

import java.util.List;

import com.lti.home.pojo.Applicationdoc;



public interface Applicationservice
{
	public boolean addApplication(Applicationdoc app);
	public List<Applicationdoc> getApplications();
	

}
