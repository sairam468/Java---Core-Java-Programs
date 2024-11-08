package java_programs;

import java.util.Scanner;

public class SCP {

	static Scanner sc=new Scanner(System.in);
	void m1() {
		System.out.println("Enter Your name :");
		String eName=sc.next();
		System.out.println("Enter Your EmpId :");
		int eId=sc.nextInt();
		System.out.println("Enter Your Salary :");
		int eSalary=sc.nextInt();
		System.out.println("Enter Your Address :");
		sc.nextLine();
		String eAddress=sc.nextLine();
		
		System.out.println("\n\nEmployee details are");
		System.out.println("Employee name is :"+eName);
		System.out.println("Employee ID is :"+eId);
		System.out.println("Employee Salary is :"+eSalary);
		System.out.println("Employee Address is :"+eAddress);
		sc.close();
	}
	public static void main(String[] args) {
		new SCP().m1();
	}
}
