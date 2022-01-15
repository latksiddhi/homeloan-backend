package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Account;
import com.lti.mypack.repository.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accRepo;
	
	@Override
	public Account findAccount(int loanid) {
		
		return accRepo.findById(loanid).get();
	}
	
	@Override
	public Account findAccount1(int applicationid) {
		// TODO Auto-generated method stub
		return accRepo.findByApplicationid(applicationid);
	}

	@Override
	public Account addAccount(Account account) {
		return accRepo.save(account);
		
	}

	@Override
	public List<Account> getAccountAdmin() {
		
		return accRepo.findAll();
	}

	@Override
	public boolean updateAccount(Account account) {
		Account newa=accRepo.findById(account.getLoanid()).get();
		newa=account;
		accRepo.save(newa);
		return false;
	}

	@Override
	public boolean deleteAccount(Account account) {
		accRepo.delete(account);
		return false;
	}

}
