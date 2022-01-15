package com.lti.mypack.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GenericGenerator(name = "accountseq", strategy = "sequence", parameters = {
			@org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
			@org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"), })
	@GeneratedValue(generator = "accountseq", strategy = GenerationType.SEQUENCE)
	private int loanid;
	private float loanamount;
	private float interestrate;
	private float pendingamount;
	private Date startdate;
	private Date enddate;
	private String applicationid;
	private String ifsccode;
	private float accountbalance;
	public int getLoanid() {
		return loanid;
	}

	public float getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(float loanamount) {
		this.loanamount = loanamount;
	}
	public float getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(float interestrate) {
		this.interestrate = interestrate;
	}
	public float getPendingamount() {
		return pendingamount;
	}
	public void setPendingamount(float pendingamount) {
		this.pendingamount = pendingamount;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public float getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(float accountbalance) {
		this.accountbalance = accountbalance;
	}

	public Account(int loanid, float loanamount, float interestrate, float pendingamount, Date startdate, Date enddate,
			String applicationid, String ifsccode, float accountbalance) {
		super();
		this.loanid = loanid;
		this.loanamount = loanamount;
		this.interestrate = interestrate;
		this.pendingamount = pendingamount;
		this.startdate = startdate;
		this.enddate = enddate;
		this.applicationid = applicationid;
		this.ifsccode = ifsccode;
		this.accountbalance = accountbalance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
