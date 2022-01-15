package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Account;
import com.lti.mypack.model.Admin;



public interface AdminService {

	public List<Admin> getAdmin();

	public Account findAccount(String applicationid);

	public boolean addAdmin(Admin admin);

	//public boolean updateAdmin(Admin admin);

	public boolean deleteAdmin(Admin admin);
	
	
}