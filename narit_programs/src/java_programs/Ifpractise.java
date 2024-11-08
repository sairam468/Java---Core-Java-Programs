package java_programs;

public class Ifpractise {

	void m1(int x,int y,int z) {
		if(x>y) {		
			if(x>z) {
				System.out.println("X");
			}
			else
				System.out.println("Z");
		}
		else if (y>x) {
			if(y>z)
				System.out.println("Y");
			else
				System.out.println("Z");
		}}

	void m2(int x,int y,int z) {
		if(z>y) {
			if(z>x)
				System.out.println(z+" is greater");
		}
		if(y>x) {
			if(y>z)
				System.out.println(y+" is greater");
		}
		else
			System.out.println(x+" is greater");
	}

	void m3(String empName,int years,int sal) {
		if (years>5) {
			int bonus= (sal*5)/100;
			System.out.println("congrats "+empName);
			System.out.println("You got bonus of "+bonus);
			System.out.println("Yours updated salary is "+(sal+bonus));
		}
		else {
			System.out.println("Sorry "+empName+" You Have not got any Bonus!!");
			System.out.println("Yours salary is "+(sal));
		}
	}

	void m4(int nOCA,int nOCH) {
		int att= ((nOCA)*100)/nOCH;
		if(att>=75) {
			System.out.println("Yours Attendance Percentage is "+att+"%");
			System.out.println("You are allowed to sit in the Exam");
		}
		else {
			System.out.println("Yours Attendance Percentage is "+att+"%");
			System.out.println("You are not allowed to sit in the Exam");
		}	
	}

	void m5(char c) {
		if((int)c>=65 && (int)c<=90 ) {
			System.out.println(c+ " Is Uppercase Letter");
		}
		else {
			System.out.println(c+ " Is Lowercase Letter");
		}		
	}

	public static void main(String[] args) {
		Ifpractise o=new Ifpractise();
		o.m3("Sai", 6, 10000);
		o.m3("Ram", 5, 10000);
		System.out.println();
		o.m4(75,100);
		System.out.println();
		o.m5('a');

	}

}
