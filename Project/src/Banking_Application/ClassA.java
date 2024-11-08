package Banking_Application;

import java.util.Scanner;

public class ClassA {
	static Scanner sc=new Scanner(System.in);

	public void m1() {
		System.out.println("Welcome to the Banking Application :)");
		System.out.println("Enter How many Accounts You Want To Create");
		int n=sc.nextInt();
		//		ClassB c=new ClassB();
		//		c.Add_acc();
		ClassB a[]=new ClassB[n];
		for(int i=0;i<a.length;i++) {
			a[i]=new ClassB();
			a[i].Add_acc();
		}
		int operation;
		do {
			System.out.println("\nEnter Your Operation");
			System.out.println("1.)To Check Accounts Details");
			System.out.println("2.)To Withdraw Money from Your Account");
			System.out.println("3.)To Deposit Money into Your Account");
			System.out.println("4.)To Check Balance in Your Account");
			System.out.println("5.)Exit");
			operation=sc.nextInt();

			if(operation==1) {
				for(int i=0;i<a.length;i++) {
					
						a[i].Acc_det();
					}
				}


			else if(operation==2) {
				System.out.println("Enter Account Number : ");
				String an=sc.next();
				for(int i=0;i<a.length;i++) {
					if(an.equals(a[i].get_acc_num())) {
						a[i].withdraw();
					}
				}
			
			}
			else if(operation==3) {
				System.out.println("Enter Account Number : ");
				String an=sc.next();
				for(int i=0;i<a.length;i++) {
					if(an.equals(a[i].get_acc_num())) {
						a[i].deposit();
					}
				}
				
			}
			else if(operation==4) {
				System.out.println("Enter Account Number : ");
				String an=sc.next();
				for(int i=0;i<a.length;i++) {
					if(an.equals(a[i].get_acc_num())) {
						a[i].check_bal();
					}
				}
				
			}
			else
				System.out.println("Thank you for Using This Service!!");
		}
		while(operation!=5);


	}

	public static void main(String[] args) {
		new ClassA().m1();

		sc.close();
	}

}
