package oops;

import java.util.Scanner;

public class EncapClassB {

	void m() {
		Scanner sc=new Scanner(System.in);
		EncapClassA aobj=new EncapClassA();
		System.out.println("Enter name of employees");
		aobj.setEmpName(sc.next());
		System.out.println("Enter employee  Experience");
		aobj.setEmpExperience(sc.nextInt());

		System.out.println("Enter employee number Salary");
		aobj.setEmpSalary(sc.nextInt());
		
		System.out.println("-----employee details----");
		
		System.out.println("Employee Name is : "+aobj.getEmpName());
		System.out.println("Employee salaray is : "+aobj.getEmpSalary());
		System.out.println("Employee Experience is : "+aobj.getEmpExperience());
	}
	public static void main(String[] args) {
		new EncapClassB().m();
	}

}
