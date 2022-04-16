
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_tab")
public class Department {
	@Id
	@Column(name="did")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	@Column(name="dname")
	private String dname;
	@Column(name="dloc")
	private String dloc;
	@OneToMany( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="did")
	private List<Employee>employees;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	
	
	

}
