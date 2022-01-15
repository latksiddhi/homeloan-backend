package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Account;
import com.lti.mypack.model.Application;
import com.lti.mypack.service.ApplicationService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("homeloanrest/api")
public class ApplicationController {
	
	@Autowired
	ApplicationService appService;
	
	@GetMapping("/application")
	public List<Application> getAll(){
		return appService.getApplication();
	}
	
	@GetMapping("/application/{application_id}")   //for loan status
	public Application getApplbyID(@PathVariable(name="application_id") int applicationid) {
		return appService.getApplbyID(applicationid);
	}
	
	@PostMapping("/application")
	public Application addApplication(@RequestBody Application application) {
		return appService.addApplication(application);
	}
	@PutMapping("/application")
	public boolean updateApp(@RequestBody Application application) {
		return appService.updateApplication(application);
	}
	//For Application approval
	@PutMapping("/application/{application_id}")
	public Application updateStatus(@PathVariable(name="application_id") int applicationid,@RequestBody Application application ) {
		
		return appService.updateStatus(applicationid,application);
	}
	
	
	@DeleteMapping("/application/{applicationid}")
	public boolean deleteApp(@PathVariable(value="applicationid") int applicationid) {
		return appService.deleteApp(applicationid);
     }
}
