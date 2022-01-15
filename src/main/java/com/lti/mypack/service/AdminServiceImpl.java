package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Account;
import com.lti.mypack.model.Admin;

import com.lti.mypack.repository.AdminRepository;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepo;
	
	@Override
	public List<Admin> getAdmin() {
		
		return adminRepo.findAll();
	}

	@Override
	public Account findAccount(String applicationid) {
		// TODO Auto-generated method stub
		return adminRepo.findByApplicationid(applicationid);
	}

	@Override
	public boolean addAdmin(Admin admin) {
		adminRepo.save(admin);
		return false;
	}

//	@Override
//	public boolean updateAdmin(Admin admin) {
//		Admin newad=adminRepo.findById;
//		newad=admin;
//		adminRepo.save(newad);
//		return false;
//	}

	@Override
	public boolean deleteAdmin(Admin admin) {
		adminRepo.delete(admin);
		return false;
	}	

}