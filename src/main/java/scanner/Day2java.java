package scanner;

import java.util.Scanner;

public class Day2java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myobj = new Scanner(System.in);
		
		 System.out.println("Enter Details");
	    int id = myobj.nextInt();
	   
	    String empname = myobj.nextLine();
	    String mailid  = myobj.next();
	    double phnno = myobj.nextDouble();
	    double salary = myobj.nextDouble();
	    
	    System.out.println("id is"+id);
	    System.out.println("empname is"+empname);
	    System.out.println("mailid is"+mailid);
	    System.out.println("phnno is"+phnno);
	    System.out.println("salary is"+salary);
	}

}
