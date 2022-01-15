package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="application")
public class Application {

	@Id
	@GenericGenerator(name = "applicationseq", strategy = "sequence", parameters = {
            @org.hibernate.annotations.Parameter(name = "ApplicationSeq", value = "sequence"),
            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),
    })
    @GeneratedValue(generator = "applicationseq", strategy=GenerationType.SEQUENCE)
	private int applicationid;
	public int getApplicationid() {
		return applicationid;
	}
	private int custid;
	private String propertyname;
	private String propertylocation;
	private float estimatedamount;
	private String loanstatus;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public String getPropertylocation() {
		return propertylocation;
	}
	public void setPropertylocation(String propertylocation) {
		this.propertylocation = propertylocation;
	}
	public float getEstimatedamount() {
		return estimatedamount;
	}
	public void setEstimatedamount(float estimatedamount) {
		this.estimatedamount = estimatedamount;
	}
	public String getLoanstatus() {
		return loanstatus;
	}
	public void setLoanstatus(String loanstatus) {
		this.loanstatus = loanstatus;
	}
	public Application(int applicationid, int custid, String propertyname, String propertylocation,
			float estimatedamount, String loanstatus) {
		super();
		this.applicationid = applicationid;
		this.custid = custid;
		this.propertyname = propertyname;
		this.propertylocation = propertylocation;
		this.estimatedamount = estimatedamount;
		this.loanstatus = loanstatus;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
