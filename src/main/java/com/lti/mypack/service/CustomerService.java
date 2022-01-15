package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Customer;



public interface CustomerService {

	public List<Customer> getCustomer();
	public Customer addValue(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
	public Customer findcust(int custid);
	public Customer getCustomerById(int customerid);
	
}