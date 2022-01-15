package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankadmin")
public class Admin {
	
	@Id
	private String ifsccode;
	private String adminname;
	private String adminpassword;
	private String applicationid;
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	public String getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String ifsccode, String adminname, String adminpassword, String applicationid) {
		super();
		this.ifsccode = ifsccode;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
		this.applicationid = applicationid;
	}
	@Override
	public String toString() {
		return "Admin [ifsccode=" + ifsccode + ", adminname=" + adminname + ", adminpassword=" + adminpassword
				+ ", applicationid=" + applicationid + "]";
	}
	
	
	
	

}