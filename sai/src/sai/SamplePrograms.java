package sai;


import java.util.Scanner;

public class SamplePrograms {
	public static void main (String args[]) {
		//User input
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First String Value");
		String s=sc.next();
		System.out.println("Enter the Second String Value");
		String s1=sc.next();
		System.out.println("The Strings are:"+s+" "+s1);
		System.out.println();


		//Add 2 integers
		System.out.println("Enter the First Number");
		int n1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int n2=sc.nextInt();
		int sum = n1+n2;
		System.out.println("The Sum of two Numbers is "+sum);
		System.out.println();


		//Multiply 2 floating point numbers
		System.out.println("Enter the First  Number");
		float f1=sc.nextFloat();
		System.out.println("Enter the Second Number");
		float f2=sc.nextFloat();
		float product = f1*f2;
		System.out.println("The Product of two Numbers is "+product);
		System.out.println();


		//ASCII values of the characters
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		int ascii =ch;
		//int castascii=(int)ch;
		System.out.println("The ASCII value of"+ch+" is "+ascii);
		System.out.println("The ASCII value of"+ch+" is "+ascii);


		sc.close();
	}
}

