package com.createiq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="addr_tab")
public class Address {
	@Id
	@Column(name="aid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	@Column(name="aloc")
	private String aloc;
	@Column(name="aphno")
	private String aphno;
	@OneToOne(mappedBy = "address")
	private Employee employee;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	public String getAphno() {
		return aphno;
	}
	public void setAphno(String aphno) {
		this.aphno = aphno;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
