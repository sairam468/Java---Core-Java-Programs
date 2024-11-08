package Top100InterviewQuestions;

import java.util.Scanner;

//Working with Numbers

public class interview_codes_on_numbers {
	static Scanner sc=new Scanner(System.in);
	
	public void m1() {
		//HCF of Two Numbers
		System.out.println("Enter Two Numbers :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int Hcf=0;
		for(int i=1;i<=n1||i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				Hcf=i;
			}}
		System.out.println("HCF is :"+Hcf);	
	}
	

	public void m2() {
		//LCM of Two Numbers
		System.out.println("Enter Two Numbers :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int Hcf=0;
		for(int i=1;i<=n1||i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				Hcf=i;
			}}
		int Lcm=n1*n2/Hcf;
		System.out.println("LCM is :"+Lcm);	
	}
	
	public void m3() {
		//find out the quadrant in which the given co-ordinate lie
		System.out.println("Enter Two Numbers :");
		int x=sc.nextInt();
		int y=sc.nextInt();
        if(x>0 && y>0)
            System.out.println("Quadrant I");   
        else if(x<0 && y>0)
            System.out.println("Quadrant II");
        else if(x<0 && y<0) System.out.println("Quadrant III");  
        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");
        else if (x == 0 && y == 0)
            System.out.println("Origin");
        else if (y==0 && x!=0)
            System.out.println("x-axis");
        else if (x==0 && y!=0)
            System.out.println("y-axis");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		interview_codes_on_numbers o=new interview_codes_on_numbers();
		o.m3();
		sc.close();
		
	}

}
