package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Account;

public interface AccountService {
	public Account findAccount(int loanid);
	public Account findAccount1(int applicationid);
	public Account addAccount(Account account);
	public List<Account> getAccountAdmin();
	public boolean updateAccount(Account account);
	public boolean deleteAccount(Account account);
	
}
