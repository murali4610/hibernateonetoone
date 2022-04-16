package com.createiq.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab")
public class Employee {
@Id
@Column(name="eid")
@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int eid;
 private String ename;
 private double esal;
 
 @OneToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY )
 @JoinColumn(name="aid")
 private Address address;
 
 @ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name="did")
 private Department department;
 @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="emp_pro",joinColumns= {@JoinColumn(name="eid")},inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Project> projects;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}


 
}