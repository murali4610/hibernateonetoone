package com.createiq.testapp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;


import com.createiq.model.Address;
import com.createiq.model.Department;
import com.createiq.model.Employee;
import com.createiq.model.Project;
import com.createiq.utillconnection.SessionUtil;



public class OneToManyTestclass {
	
	public static void main(String[] args) {
		
		
		
		Address a1=new Address();
		a1.setAloc("hyd");
		a1.setAphno("85003546");
		
		Address a2=new Address();
		a2.setAloc("guntkal");
		a2.setAphno("2356166");
		Project p1=new Project();
		p1.setPname("ems");
		Project p2=new Project();
		p2.setPname("sms");
		List<Project> projects = new ArrayList<Project>();
		projects.add(p1);
		projects.add(p2);
		Employee e1=new Employee();
		e1.setEname("mohan");
		e1.setEsal(1220000.00);
		e1.setAddress(a1);
		e1.setProjects(projects);
		
		Employee e2=new Employee();
		e2.setEname("ram");
		e2.setEsal(1320000.00);
		e2.setAddress(a2);
		e2.setProjects(projects);
		
		Department department=new Department();
		department.setDname("IT");
		department.setDloc("hyd");
		
		List<Employee> employees=new ArrayList();
		employees.add(e1);
		employees.add(e2);
		Session session=SessionUtil.getSession();

		department.setEmployees(employees);
		
	 
	 
		
		
		
		
		
		

		session.save(department);
		
		session.beginTransaction().commit();
		SessionUtil.close(session);
		
		
		
	}

}
