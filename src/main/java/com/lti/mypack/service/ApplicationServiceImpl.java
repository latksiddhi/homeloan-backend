package com.lti.mypack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Application;

import com.lti.mypack.repository.ApplicationRepository;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	ApplicationRepository appRepo;
	@Override
	public List<Application> getApplication() {
		
		return appRepo.findAll();
	}

	@Override
	public Application addApplication(Application application) {
		return appRepo.save(application);
		
	}

	@Override
	public boolean deleteApp(int applicationid) {
		appRepo.deleteById(applicationid);
		return true;	
	}

	@Override
	public boolean updateApplication(Application application) {
		Application newapp=appRepo.findById(application.getApplicationid()).get();
		application.setLoanstatus("Approved");
		newapp=application;
		appRepo.save(newapp);
		return true;
	}

	@Override
	public Application getApplbyID(int applicationid) {
		
	Application appsearch=appRepo.findById(applicationid).get();
		return appsearch;
		
	}

	//service for loan approval
	@Override
	public Application updateStatus(int applicationid, Application application) {
		Application app=appRepo.findById(applicationid).get();
		app.setLoanstatus("Approved");
		return app;
	}

}
