package com.lti.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Account;
import com.lti.mypack.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	public Account findByApplicationid(String applicationid);
}