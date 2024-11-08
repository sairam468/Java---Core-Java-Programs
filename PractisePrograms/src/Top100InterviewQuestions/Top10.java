package Top100InterviewQuestions;

import java.util.Scanner;

public class Top10 {
	static Scanner sc= new Scanner(System.in);
	public void m1() {
		//1.)Check if a Number is Positive or Negative in Java

		//1.)using if
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		if(n>0) 
			System.out.println(n+" is a positive number");
		else if(n<0) 
			System.out.println(n+" is a negative number");
		else
			System.out.println(n+" is a zero");

		//2.)using nested if....

		//3.)using ternary operator
		if(n!=0)
			System.out.println(n>0?"positive number":"negative number");
		else
			System.out.println("\n"+n+" is a zero");
	}

	public void m2()
	{
		//2.)Check Whether a Number is Even or Odd in Java

		//1.)using if
		System.out.println("Enter a number :");
		int n2=sc.nextInt();
		if(n2%2==0) {
			System.out.println(n2+" is a even number");
		}
		else
			System.out.println(n2+" is a odd number");


		//2.)using ternary operator
		System.out.println(n2%2==0 ?"Even" : "odd");

		//3.)Using Bitwise Operator
		if((n2&1)!=1)
			System.out.println("even");
		else 
			System.out.println("odd");
	}

	public void m3()
	{
		//3.)Sum of First N Natural Numbers in Java

		//1.)Using for Loop
		System.out.println("Enter sum upto number :");
		int n3=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n3;i++) {
			sum+=i;
		}
		System.out.println("sum is :"+sum);	

		//2.)Using Formula for the Sum of Nth Term
		System.out.println("sum is :"+ (n3*(n3+1))/2);

		//3.)Using Recursion
	}
	static int sum(int n3){
		if(n3==0)
			return n3;
		return n3+sum(n3-1);
	}

	public void m4()
	{
		//4.)Find the Sum of the Numbers in a Given Interval in Java

		//1.)Using for Loop
		System.out.println("Enter Range numbers");
		System.out.println("a value");
		int a=sc.nextInt();
		System.out.println("b value");
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println("sum is :"+sum);

		//2.)Using Recursion
	}
	static int sum_m4(int n,int m) {
		if(n==m)
			return n;
		return m+sum_m4(n,m-1);
	}

	public void m5()
	{
		//5.) Greatest of the Two Numbers in Java

		//1.)Using if-else Statements
		System.out.println("Enter numbers");
		System.out.println("a value");
		int a=sc.nextInt();
		System.out.println("b value");
		int b=sc.nextInt();
		if(a==b)
			System.out.println("a equals to b");
		else if(a>b)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");

		//2.)Using Ternary Operator
		if(a==b)
			System.out.println("a equals to b");
		System.out.println(a>b?"a is greater":"b is greater");

		//3.)sing inbuilt max Function
		if(a==b)
			System.out.println("a equals to b");
		//System.out.println(Math.max(a, b));
		System.out.println(Math.max(a,b) + " is greater");

	}

	public void m6()
	{
		//6.)Greatest of the Three Numbers in Java
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();

		//1.)Using if-else and nested if
		//		if(x>y) {
		//			if(x>z)
		//				System.out.println("x is greater");
		//			else
		//				System.out.println("z is greater");
		//		}
		//		if(y>x) {
		//			if(y>z)
		//				System.out.println("y is greater");
		//			else
		//				System.out.println("z is greater");
		//		}

		if(x>y) {
			if(x>z)
				System.out.println("x is greater");
		}
		if(y>x) {
			if(y>z)
				System.out.println("y is greater");
		}
		if(z>x){
			if(z>y)
				System.out.println("z is greater");
		}

		//2.)using logical operators
		if ((x >= y) && (x >= z))
			System.out.println (x + " is the greatest");
		else if (y >= x && y >= z)
			System.out.println (y + " is the greatest");
		else
			System.out.println (z + " is the greatest");

		//3.)using ternary operator
		int temp = x>=y ? x : y;
		int greatest = temp>=z  ? temp :z;
		System.out.println(greatest+" is greatest number");
	}


	public void m7()
	{
		//7.)Leap year or NOT

		//1.)Using if
		System.out.println("Enter the year");
		int y=sc.nextInt();
		if(y%400==0) {
			System.out.println(y+" is a Leap year");
		}
		else if(y%4==0) {
			if(y%100!=0) {
				System.out.println(y+" is a Leap year");
			}
			else
				System.out.println(y+" is Not a Leap year");
		}
		else
			System.out.println(y+" is Not a Leap year");


		//2.)using Logical operator and if
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			System.out.println (y + " is a Leap Year");

		else
			System.out.println (y + " is not a Leap Year");

		//3.)Using Ternary operator
		int flag = (y%400 == 0) || (y%4==0 && y%100!=0 ) ? 1 : 0;
		if (flag ==1)
		{
			System.out.println (y + " is a Leap Year");
		}
		else
		{
			System.out.println (y + " is not a Leap Year");
		}

		//4.)Bonus Boolean Method
		boolean leap;
		if (y % 400 == 0)
			leap = true;

		else if (y % 4 == 0 && y % 100 != 0)
			leap = true;

		else
			leap = false;

		if (leap)
			System.out.println(y + " is a leap year.");
		else
			System.out.println(y + " is not a leap year.");
	}

	public void m8()
	{
		//8.)Prime or NOT
		//1.)using count
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int count=0;
		if(n<2) {
			System.out.println("Not prime");
			System.exit(0);
		}
		for(int i=1;i<n;i++) {
			if(n%i==0)
				count++;
		}

		if(count>1)
			System.out.println("Not prime");
		else
			System.out.println("prime");

		//2.)using flag
		boolean f=false;
		if(n<2) {
			System.out.println("Not prime");
			System.exit(0);
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				f=true;
				break;
			}
		}
		if(f)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");

		//3.)Optimization by n/2 iterations
		boolean ff=false;
		if(n<2) {
			System.out.println("Not prime");
			System.exit(0);
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				ff=true;
				break;
			}
		}
		if(ff)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");


		//4.)using recursion
		int i=2;
		boolean isPrime=true;
		isPrime=isprime(n,i);
        System.out.println(isPrime?"Prime":"not prime");


	}
	public static boolean isprime(int n,int i) {
        if(n<2)
        	return false;
        if(i==n)
        	return true;
        if(n%i==0)
        	return false;
        i++;			
        return isprime(n,i);
	}

	public void m9()
	{
		//1.)using count
		System.out.println("Enter number: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for(int j=n1;j<=n2;j++) {
			if(j>1) {
			int c=0;
			for(int i=1;i<j;i++) {
				if(j%i==0) {
					c++;
				}
			}
			if(c<2)System.out.println(j);
		}}
		System.out.println("---------------------------------");
		
		//2.)using recursion
		for(int j=n1;j<=n2;j++) 
			if(checkprime(j))
				System.out.println(j);
	}
	public static boolean checkprime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<n;i++) {
		  if(n%i==0) {
			  return false;
		  }
		}
		return true;
	}
	

	





	public static void main(String[] args) {
		Top10 o=new Top10();
		System.out.println("start");
		//o.m1();
		//o.m2();
		//o.m3();
		//System.out.println(sum(100));
		//o.m4();
		//System.out.println(sum_m4(11,66));
		//o.m5();
		//o.m6();
		//o.m7();
		//o.m8();
        o.m9();

		sc.close();
	}

}
