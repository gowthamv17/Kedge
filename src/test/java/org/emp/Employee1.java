package org.emp;

import org.project.Project1;

public class Employee1 extends Project1 {

	public void employeename1(){
		System.out.println("gowtham");
	}
	public static void main(String[] args){
		
		Employee1 empp = new Employee1();
		empp.clientname1();
		empp.companyname1();
		empp.employeename1();
		empp.projectname1();
	}
}