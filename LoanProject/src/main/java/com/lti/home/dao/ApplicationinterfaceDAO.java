package com.lti.home.dao;





import java.util.List;

import com.lti.home.pojo.Applicationdoc;



public interface ApplicationinterfaceDAO { 

	public boolean addApplication(Applicationdoc app);
	
	public List<Applicationdoc> getApplications();

}