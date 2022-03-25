package com.lti.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.home.pojo.Applicationdoc;
import com.lti.home.pojo.CustomerRegister;
import com.lti.home.service.Applicationservice;
import com.lti.home.service.RegisterFormInterfaceservice;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class RegisterFormController {
	

	@Autowired
	RegisterFormInterfaceservice rService;
	
	
	@GetMapping("/customerregister")
	public List<CustomerRegister> getloan()
	{
		return rService.getloan();
	}
	
	@PostMapping("/customerregister")
	public boolean addloan(@RequestBody CustomerRegister customerregister)
	{
		return rService.addloan(customerregister);
	
	

}
	@Autowired
	Applicationservice vService;
	
	@GetMapping("/app")
	public List<Applicationdoc> getApplications()
	{
		return vService.getApplications();
		
	}
	@PostMapping("/app")
	public boolean addApplication(@RequestBody Applicationdoc app) {
		return vService.addApplication(app);
}
	
	@GetMapping("/validatelogin/{email}/{password}") 
	public boolean validateLogin(@PathVariable("email") String email,@PathVariable("password") String password)
	{
			return rService.validateLogin(email, password);
	}
	
	
	@GetMapping("/admin/{email}/{password}") 
	public boolean adminvalidateLogin(@PathVariable("email") String email,@PathVariable("password") String password)
	{
			return rService.adminvalidateLogin(email, password);
	}

@GetMapping("/searchuser/{email}") 
public List<CustomerRegister> searchUser(@PathVariable("email")  String email)
{
	return rService.searchUser(email);
}

@GetMapping("/searchadmin/{userid}") 
public List<CustomerRegister> searchAdmin(@PathVariable("userid")  int userid)
{
	return rService.searchAdmin(userid);

}
}

