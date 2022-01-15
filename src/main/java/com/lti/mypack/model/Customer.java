package com.lti.mypack.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "customer")
@Table(name = "customer")
public class Customer {
	@Id
	@GenericGenerator(name = "customerseq", strategy = "sequence", parameters = {
			@org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
			@org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"), })
	@GeneratedValue(generator = "customerseq", strategy = GenerationType.SEQUENCE)
	private int customerid;
	private String firstname;
	private String lastname;
	private String nationality;
	private String gender;
	private String address;
	private String phonenumber;
	private Date dateofbirth;
	private String emailid;
	private float annualincome;
	private String typeofemployement;
	private int retirementage;
	private String organizationtype;
	private String employername;
	private String password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public float getAnnualincome() {
		return annualincome;
	}
	public void setAnnualincome(float annualincome) {
		this.annualincome = annualincome;
	}
	public String getTypeofemployement() {
		return typeofemployement;
	}
	public void setTypeofemployement(String typeofemployement) {
		this.typeofemployement = typeofemployement;
	}
	public int getRetirementage() {
		return retirementage;
	}
	public void setRetirementage(int retirementage) {
		this.retirementage = retirementage;
	}
	public String getOrganizationtype() {
		return organizationtype;
	}
	public void setOrganizationtype(String organizationtype) {
		this.organizationtype = organizationtype;
	}
	public String getEmployername() {
		return employername;
	}
	public void setEmployername(String employername) {
		this.employername = employername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCustomerid() {
		return customerid;
	}
	public Customer(int customerid, String firstname, String lastname, String nationality, String gender,
			String address, String phonenumber, Date dateofbirth, String emailid, float annualincome,
			String typeofemployement, int retirementage, String organizationtype, String employername,
			String password) {
		super();
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationality = nationality;
		this.gender = gender;
		this.address = address;
		this.phonenumber = phonenumber;
		this.dateofbirth = dateofbirth;
		this.emailid = emailid;
		this.annualincome = annualincome;
		this.typeofemployement = typeofemployement;
		this.retirementage = retirementage;
		this.organizationtype = organizationtype;
		this.employername = employername;
		this.password = password;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}