package Top100InterviewQuestions;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Top10_20 {
	static	Scanner sc=new Scanner(System.in);
	public void m1() {

		//1)Sum of Digits of a Number
		//1)using brute force
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int ss=0;
		while(n!=0) {
			ss+=n%10;
			n=n/10;
		}
		System.out.println("sum is "+ss);

		//2)using recursion
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		int s1=sum1(n1,0);
		System.out.println("sum is :"+s1);



		//3)using recursion-II
		System.out.println("Enter the number");
		int n2=sc.nextInt();
		int s2=sum2(n2);
		System.out.println("sum is :"+s2);


		//4)Using ACSII Table by string
		System.out.println("Enter the number");
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=s.charAt(i)-48;
		}
		System.out.println("sum is :"+sum);

		System.out.println("---------------------------------");
	}

	static int sum1(int n,int sum) {
		if(n==0)
			return sum;

		sum+=n%10;
		return sum1(n/10,sum);
	}
	static int sum2(int n) {
		if(n==0)
			return 0;
		return n%10+sum2(n/10);
	}

	//---------------------------------------------------------------

	public void m2() {

		//2)Reverse a Number
		//1)Using while loop
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int r=0;
		while(n>0) {
			r=r*10+n%10;
			n=n/10;
		}
		System.out.println(r);

		//2)using for loop
		int n1=sc.nextInt();
		int r1=0;
		for(;n1>0;n1=n1/10) {
			r1=r1*10+n1%10;
		}
		System.out.println(r1);

		//3)using recursion
		int n2=sc.nextInt();
		rev(n2);

		//4)using recursion
		int n3=sc.nextInt();
		System.out.println(getReverse(n3,0));

		//5)reversing a negative number
		int n4=sc.nextInt();
		if(n4<0) {
			System.out.print("-");
			int n5=n4*(-1);
			rev(n5);
		}

	}
	public void rev(int n) {

		if (n == 0)
			return ;

		int rem = n % 10;
		System.out.print(rem);

		rev (n / 10);

	}
	static int getReverse (int num, int rev)
	{
		if (num == 0)
			return rev;

		int rem = num % 10;
		rev = rev * 10 + rem;

		return getReverse (num / 10, rev);
	}

	//------------------------------------------------------------------------

	public void m3() {

		//3)Palindrome of a Number
		//1)Using iterator
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int org=n;
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n/=10;
		}
		if(org==rev)System.out.println("palindrome");
		else System.out.println("not palindrome");		

		//2)using recursion
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		int org1=n1;
		int rev1 =palindrome(n1,0);
		System.out.println(palindrome(n1,0));
		if(org1==rev1)System.out.println("palindrome");
		else System.out.println("not palindrome");	

	}

	public int palindrome(int n,int r) {
		if(n==0)
			return r;
		int rem=n%10;
		r=r*10+rem;


		return palindrome(n/10,r);
	}

	//-------------------------------------------------------------------------
	public void m4() {

		//4)Armstrong Number
		//1)Using iterator
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int org=n;
		int s=0;
		int d=0;
		int r=0;
		while(n>0) {
			d++;
			n/=10;
		}
		n=org;
		//System.out.println(d);
		while(n!=0) {
			r=n%10;
			s=s+(int)Math.pow(r, d);
			n/=10;
		}
		//System.out.println(s);
		if(org==s)System.out.println("Armstrong");
		else System.out.println("not Armstrong");	

		//2)Using recursion
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		int c=count(n1);
		if(arm(n1,c)==n1)System.out.println("Armstrong");
		else System.out.println("not Armstrong");	

	}
	public int count(int n) {
		int l=0;
		while(n>0) {
			l++;
			n/=10;
		}
		return l;
	}
	public int arm(int n,int c) {
		if(n==0)
			return 0;
		int d=n%10;
		return (int)Math.pow(d,c)+arm(n/10,c);
	}

	//-------------------------------------------------------------------------
	public void m5() {

		//5)Armstrong Number in range
		//1)Using iterator
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int n=n1;n<=n2;n++) {

			int sum=0,temp=n,digit,len=0;
			while(temp>0) {
				len++;
				temp/=10;
			}
			temp=n;
			//System.out.println(d);
			while(temp>0) {
				digit=temp%10;
				sum=sum+(int)Math.pow(digit, len);
				temp/=10;
			}
			//System.out.println(sum);
			if(sum==n) {
				System.out.print(sum+" ");
			}

		}


	}

	//--------------------------------------------------------------------------------


	public void m6() {
		//6.)Lower to upper vice-versa
		//97-122 l ===65-90

		System.out.println("Enter a character");
		char c=sc.next().charAt(0);

		if(c>=65 && c<=90) {
			c=(char)((int)c+32);
		}
		else if(c>=97 && c<=122) {
			c=(char)((int)c-32);
		}
		System.out.println(c);

	}

	//--------------------------------------------------------------------------------

	public void m7() {
		//7.)Fibonacci number

		System.out.println("Enter number");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		int t;
		for(int i=2;i<=n;i++) {
			t=n1+n2;
			n1=n2;
			n2=t;
			System.out.print(t+" ");
		}
	}


	public void m8() {
		//8.)Factorial of a number

		//1)using iterator
		System.out.println("Enter number");
		int n=sc.nextInt();
		int f=1;
		for(int i=n;i>0;i--) {
			f*=i;
		}
		System.out.println("factorial is "+f);

		//2)using Recursion
		System.out.println("Enter number");
		int n1=sc.nextInt();
		System.out.println("factorial is "+fact(n1));	
	}

	public int fact(int n) {
		if(n>0)
			return n*fact(n-1);
		return 1;
	}

	//-----------------------------------------------------------------------

	public void m9() {
		//9.)Power of a number

		//1)using while
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Enter power of a number");
		int p=sc.nextInt();
		int pow=p;
		int r=1;
		while(p!=0) {
			r*=n;
			p--;
		}
		System.out.println("power of "+n+" is :"+r);

		//2)using formula
		int res=(int)Math.pow(n, pow);
		System.out.println("power of "+n+" is :"+res);

		//3)using iterator
		System.out.println("power of "+n+" is :"+pow(n,pow));
	}
	public int pow(int n,int exp) {
		if(n==0)
			return 0;
		if(exp ==0)
			return 1;

		return n*pow(n,exp-1);
	}

	//-------------------------------------------------------------------------------

	public void m10() {
		//10.)Factors of a number

		//1)using while	
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		System.out.println("Factors are :");
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}	
	}

	//----------------------------------------------------------------------------

	public static void main(String[] args) {
		Top10_20 o=new Top10_20();
		//o.m1();
		//o.m2();
		//o.m3();
		//o.m4();
		//o.m5();
		//o.m6();
		//o.m7();
		//o.m9();
		o.m10();
		sc.close();
	}
}






