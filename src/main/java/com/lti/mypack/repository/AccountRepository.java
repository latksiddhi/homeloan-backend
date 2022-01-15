package com.lti.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	public Account findByApplicationid(int applicationid);
}
