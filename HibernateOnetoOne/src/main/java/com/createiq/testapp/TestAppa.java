package com.createiq.testapp;

import org.hibernate.Session;

import com.createiq.model.Address;
import com.createiq.model.Employee;
import com.createiq.utillconnection.SessionUtil;

public class TestAppa {

	public static void main(String[] args) {
		Address address=new Address();
		address.setAloc("atp");
		address.setAphno("8500034446");
   Employee  e1=new Employee();
   e1.setEname("murali");
   e1.setEsal(25000.00);
   e1.setAddress(address);
   Session session=SessionUtil.getSession();
   session.save(e1);
   session.beginTransaction().commit();
   SessionUtil.close(session);
	}

}
