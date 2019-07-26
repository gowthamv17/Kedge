package org.emp;

import org.company.Company;

public class Employee {

	public void employeename(){
		System.out.println("gowtham");
	}
	public static void main(String[] args){
		
		Employee empp = new Employee();
		empp.employeename();
		
		Company com = new Company();
		com.companyname();
	}
}