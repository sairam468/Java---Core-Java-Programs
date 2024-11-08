package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AL_Class {

	public void m1() {
		ArrayList <Integer> al= new ArrayList <Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("al :"+al);
	}
	
	public void m2() {
		ArrayList <String> al= new ArrayList <String>();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size of ArrayList :");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter Elements to ArrayList :");
			al.add(sc.next());
		}
		System.out.println("al :"+al);
		sc.close();
	}
	
	public void m3() {
		ArrayList <Integer> al= new ArrayList <Integer>();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		al.add(66);
		System.out.println("al :"+al);
		for(int i=0;i<al.size();i++) {
			if(al.get(i)%2==0) {
				al.remove(i);
			}
		}
		System.out.println("al :"+al);
	}
	
	public void m4() {
		ArrayList <Integer> al1= new ArrayList <Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		System.out.println("al1 :"+al1);
		
		ArrayList <Integer> al2= new ArrayList <Integer>();
		al2.add(6);
		al2.add(7);
		al2.add(8);
		al2.add(9);
		al2.add(10);
		System.out.println("al2 :"+al2);
		
		ArrayList <Integer> al= new ArrayList <Integer>();
		for(int i=0;i<al1.size();i++) {
			al.add(al1.get(i));
			}
		for(int i=0;i<al2.size();i++) {
			al.add(al2.get(i));
			}
		System.out.println("al :"+al);
}
	
	public static void main(String[] args) {
		new AL_Class().m4();
	}
	
}
