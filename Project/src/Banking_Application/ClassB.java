package Banking_Application;

import java.util.Scanner;

public class ClassB {
	Scanner sc=new Scanner (System.in);
	
	private String name;
	private String acc_num;
	private String acc_type;
	private long acc_bal;
	
	public void Add_acc() {
		System.out.println("Enter your Name : ");
		name=sc.next();
		System.out.println("Enter your Account Number : ");
		acc_num=sc.next();
		System.out.println("Enter your  Account type : ");
		acc_type=sc.next();
		System.out.println("Enter your Account Balance : ");
		acc_bal=sc.nextLong();
	}
	
	public void check_bal() {
		System.out.println("Your Account Balance is "+acc_bal);
	}
	
	public String get_acc_num() {
		return acc_num;
	}
	
	public void withdraw() {
		System.out.println("Enter Amount to be Withdraw :");
		long with_am=sc.nextLong();
		if(with_am<=acc_bal) {
			acc_bal=acc_bal-with_am;
			System.out.println("Withdraw Sucessful");
			System.out.println("Your Updated Balance Amount is :"+acc_bal);
		}
		else
			System.out.println("Your Balance is Low");
	}
	
	public void deposit() {
		System.out.println("Enter Amount to be Deposited :");
		long dep_am=sc.nextLong();
		acc_bal+=dep_am;
		System.out.println("Your Updated Balance Amount is :"+acc_bal);
	}
	
	public void Acc_det() {
		System.out.println("Name : "+name);
		System.out.println("Account Number : "+acc_num);
		System.out.println("Account type : "+acc_type);
		System.out.println("Account Balance : "+acc_bal);
		sc.close();
	
		
	}
}



