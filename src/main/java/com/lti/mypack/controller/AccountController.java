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
import com.lti.mypack.model.Document;
import com.lti.mypack.service.AccountService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("homeloanrest/api")
public class AccountController {
	
	@Autowired
	AccountService aService;
	
	@GetMapping("/account/{loanid}")
	public Account showAccount(@PathVariable(value="loanid")int loanid){
		return aService.findAccount(loanid);
		
	}
	
	// For admin
	@GetMapping("/account")
	public List<Account> getAllAdmin(){
		return aService.getAccountAdmin();
		
	}
	
	@PostMapping("/account")
	public Account addAccount(@RequestBody Account account) {
		return aService.addAccount(account);
	}
	
	@PutMapping("/account")
	public boolean updateAccount(@RequestBody Account account) {
		return aService.updateAccount(account);
	}
	
	
	@DeleteMapping("/account")
	public boolean deleteAccount(@RequestBody Account account) {
		return aService.deleteAccount(account);
	}
}
