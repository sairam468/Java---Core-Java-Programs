package java_programs;

import java.util.Scanner;

public class IterationExamples 
{

	void m1() 
	{                                  //1.)Alphabets Printing.
		char c;
		for(c='Z';c>='A';c--)
		{ //'a' & 'z'
			System.out.println(c);
		}
	}


	void m2(int n) 
	{                                   //2.)Sum of N numbers
		int sum=0;
		for(int i=1;i<=n;i++) 
		{
			sum+=i;
		}
		System.out.println(sum);
	}


	void m3()
	{                                     //3.)All ASCII values
		for(int s=1;s<=255;s++)
		{
			System.out.println((char)s);
		}
	}


	void m4(int X) 
	{                                     //4.)Factorial
		int Fact=1;
		for(int s=1;s<=X;s++)
		{
			Fact*=s;
		}
		System.out.println(Fact);
	}


	void m5(int base,int power) 
	{ 							 //5.)to find the value of one number raised to the power of another
		int result=1;
		for(int i=1;i<=power;i++) 
		{
			result*=base;
		}
		System.out.println(result);
	}


	void m6(int x) 
	{   					 	 //6.)a program to reverse the given Digits
		int rev=0;
		int tem=x;
		int rem=0;
		while(tem>0)
		{
			rem=tem%10;
			rev=rev*10+rem;
			tem/=10;
		}
		System.out.println(rev);
	}


	void m7(int x) 
	{    						  //7.)a program to sum of its Digits
		int sum=0;
		int tem=x;
		int rem=0;
		while(tem>0) 
		{
			rem=tem%10;
			sum+=rem;
			tem/=10;
		}
		System.out.println(sum);
	}


	void m8(int x,int y) 
	{  						//8.)to Check Whether a Given Number is Prime or Not	
		for(int j=x;j<=y;j++)
		{
			boolean flag=false;
			for(int i=2;i<=j/2;i++) {
				if(j%i==0) { 
					flag=true;
					break;
				}
			}
			if(!flag) 
				System.out.println(j);		
		}
	}


	void m9(int dividend,int divisor) 
	{ 				//9.)a program to calculate HCF of Two given number
		int rem, hcf = 0;
		do
		{
			rem = dividend % divisor;

			if(rem == 0)
			{
				hcf = divisor;
			}
			else
			{
				dividend = divisor;
				divisor = rem;
			}

		}while(rem != 0);

		System.out.println("HCF : " + hcf);
	}  


	void m10()     //10.)To enter the numbers till the user wants and at the end it should 
	{             //	display the count of positive, negative and zeros entered
		Scanner sc=new Scanner(System.in);
		int n,pn=0,nn=0,zn=0;
		char choice;
		do {
			System.out.println("Enter The Number :a");
			n=sc.nextInt();
			if(n>0)
				pn++;
			else if(n<0)
				nn++;
			else
				zn++;

			System.out.println("Enter Your Choice Y/N");
			choice=sc.next().charAt(0);
		}while(choice=='Y'||choice=='y');


		System.out.println("Positive number count is :"+pn);
		System.out.println("Negative number count is :"+nn);
		System.out.println("Zero number count is :"+zn);

		sc.close();

	}
	
	void m11()     //11.)To enter the numbers till the user wants and at the end 
	{             //	the program should display the largest and smallest numbers
		Scanner sc=new Scanner(System.in);
		int n;
		int ln=Integer.MIN_VALUE;
		int sn=Integer.MAX_VALUE;
		char choice;
		do {
			System.out.println("Enter The Number : ");
			n=sc.nextInt();
			if(n>ln)
				ln=n;
			if(n<sn)
				sn=n;

			System.out.println("Enter Your Choice Y/N");
			choice=sc.next().charAt(0);
		}while(choice=='Y'||choice=='y');


		System.out.println("Largest number is :"+ln);
		System.out.println("Smallest number is :"+sn);

		sc.close();

	}
	





	public static void main(String[] args) {
		new IterationExamples().m11();
		//System.out.println((int)('A'));
	}
}
