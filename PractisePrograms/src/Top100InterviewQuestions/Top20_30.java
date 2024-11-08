package Top100InterviewQuestions;

import java.util.Scanner;

public class Top20_30 {
	static Scanner sc=new Scanner(System.in);

	public void m1() {
		//1.)Finding Prime Factors of a number
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		primefactors(n);
	}
	public int isprime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public void primefactors(int n) {
		for(int i=2;i<n;i++) {
			if(isprime(i)==1) {
				int x=n;
				while(x%i==0) {
					System.out.println(i+" ");
					x/=i;
				}}}}
	//----------------------------------------------------------------------------------------------

	public void m2() {
		//2.)Strong number : a positive integer whose sum of factorials of its digits 
		//equals the number itself
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int x=n;
		int sn=0,t=1;
		while(n>0) {
			t=n%10;
			sn+=fact(t);
			n/=10;
		}
		if(x==sn) 
			System.out.println("Strong Number :)");
		else
			System.out.println("Not a Strong Number :(");

	}
	public int fact(int n) {
		int fa=1;
		while(n>0) {
			fa*=n;
			n--;
		}
		return fa;
	}

	//-------------------------------------------------------------------------------------------------

	public void m3() {
		//3.)Perfect number : s equal to the sum of its positive proper divisors, 
		//that is, divisors excluding the number itself.
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				s+=i;
			}
		}
		if(n==s)
			System.out.println("Perfect number");
		else
			System.out.println("Not a Perfect Number");

	}

	//-------------------------------------------------------------------------------------------------


	public void m4() {
		//4.)Perfect Square :numbers that are the products of integers by themselves.
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int sr=(int)Math.sqrt(n);
		if(n==sr*sr)
			System.out.println("Perfect square");
		else
			System.out.println("Not a perfect square");

	}

	//-------------------------------------------------------------------------------------------------

	public void m5() {
		//5.)Automorphic number :A Number that when squared ends with the number 
		//itself is known as the Automorphic Number
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int s=n*n;
		if(s%10==n%10) 
			System.out.println("Automorphic number");
		else
			System.out.println("Not a Automorphic number");

	}

	//-------------------------------------------------------------------------------------------------

	public void m6() {
		//6.)Harshad number : a number which is divisible by the sum of its digits
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int s=0,t=0;
		while(n>0) {
			t=n%10;
			s+=t;
			n/=10;
		}
		if(n%s==0) 
			System.out.println("Harshad number");
		else
			System.out.println("Not a Harshad number");			

	}
	

	//-------------------------------------------------------------------------------------------------

	public void m7() {
		//7.)Abundant Number :a positive integer for which the sum of 
		   //its proper divisors is greater than the number
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				s+=i;
			}
		}
		if(s>n) 
			System.out.println("Abundant Number");
		else
			System.out.println("Not a Abundant Number");	
	}
	
	//-------------------------------------------------------------------------------------------------

		public void m8() {
			//8.)Friendly pair or not  :The numbers whose ( sum of divisors ) / number ratio is  
			    //same are known as Friendly Pair Numbers.
			System.out.println("Enter Two number :");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int s1=sumoffact(n1);
			int s2=sumoffact(n2);
			if(n1/s1==n2/s2) {
				System.out.println("Friendly Pair");
			}
			else 
				System.out.println("Not a Friendly pair");
			
		}
		public int sumoffact(int n) {
			int sum=0;
			for(int i=1;i<n;i++) {
				if(n%i==0)
					sum+=i;
			}
			return sum;
		}
	


	public static void main(String[] args) {
		Top20_30 o=new Top20_30();
		//o.m1();
		//o.m2();
		//o.m3();
		//o.m4();
		//o.m5();
		//o.m6();
		//o.m7();
		o.m8();
	}

}
