package com.lti.mypack.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.lti.mypack.model.Customer;
import com.lti.mypack.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public Customer addValue(Customer customer) {
		return customerRepo.save(customer);
		
	}
	@Override
	public List<Customer> getCustomer() {
		return customerRepo.findAll();
	}
	@Override
	public boolean updateCustomer(Customer customer) {
		Customer newc=customerRepo.findById(customer.getCustomerid()).get();
		return false;
	}
	@Override
	public boolean deleteCustomer(Customer customer) {
		customerRepo.delete(customer);
		return false;
	}
	@Override
	public Customer findcust(int custid) {
		Customer findcc=customerRepo.findById(custid).get();
		return findcc;
	}
	@Override
	public Customer getCustomerById(int customerid) {  //for profile dashboard
		Customer cust=customerRepo.findById(customerid).get();
		return cust;
	}
	
	
	
	
		
	}