package sai;

import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		//sum of two arrays
		
		//		//int[]arr=new int[3];
		//		//int[] arr1=new int[]{1,2,3,4};
		//		int[] i = {2,5,3,9,6};
		//		int sum=0;
		//		for(int j=0 ; j<i.length;j++) {
		//			System.out.println(i[j]);
		//			sum+=i[j]; //sum
		//		}
		//		System.out.println("sum is :"+sum);
		//		System.out.println("Avg is :"+sum/i.length);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array1 size:");
		int a1s=sc.nextInt();
		String[] sarray=new String[a1s];
		for(int k=0;k<a1s;k++) {
			System.out.println("Enter array1 elements:");
			sarray[k]=sc.next();
		}	
		
		System.out.println("Enter array2 size:");
		int a1s2=sc.nextInt();
		String[] sarray2=new String[a1s2];
		for(int k=0;k<a1s2;k++) {
			System.out.println("Enter array2 elements:");
			sarray2[k]=sc.next();
		}

		String[] s3=new String[sarray.length+sarray2.length];
		for(int k=0;k<sarray.length;k++) {
			s3[k]=sarray[k];
		}

		for(int k=0;k<sarray2.length;k++) {
			s3[k+sarray.length]=sarray2[k];
		}
		for(int k=0;k<s3.length;k++) {
			System.out.print(s3[k]+" ");
		}

		sc.close();
	}			
}