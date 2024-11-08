package sai_collections;

import java.util.*;

public class ListInterfaceVectorAssignment {
	
	public static void main(String[] args) {
		Vector<Integer> v= new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		int sum=0;
		int sumE=0;
		System.out.println(v.get(0));
		for (int i=0;i<v.size();i++) {		
			sum+=v.get(i);
			if(v.get(i)%2==0) {
				sumE+=v.get(i);
			}	
		}
		int avg=sum/v.size();
		System.out.println("Sum is :"+sum);
		System.out.println("Average is :"+avg);
		System.out.println("Even Sum is :"+sumE);
	}
}
