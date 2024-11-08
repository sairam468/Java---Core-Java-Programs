package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTasks {

	public void m1() {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(30);
		ts.add(20);
		ts.add(25);
		System.out.println("ts :"+ts);
	}

	public void m2() {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("apple");
		ts.add("bannana");
		ts.add("cherry");
		ts.add("dates");
		ts.add("elderberry");
		//System.out.println("ts :"+ts);
		System.out.println();
		Iterator<String> i=ts.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

	public void m3() {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(50);
		ts.add(300);
		ts.add(200);
		ts.add(250);

		TreeSet<Integer> tsnew=new TreeSet<Integer>(ts);
		System.out.println("\n\ntsnew :"+tsnew);

	}

	public void m4() {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("virat");
		ts.add("rahul");
		ts.add("pant");
		ts.add("rohit");
		ts.add("hardik");

		String arr[]=new String[ts.size()];
		Iterator<String> i=ts.iterator();
		int j=0;
		while(i.hasNext()) {
			arr[j++]=i.next();
		}
		System.out.println("\n"+Arrays.toString(arr));
	}

	public void m5() {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(468);
		ts.add(50);
		ts.add(11);
		ts.add(200);
		ts.add(466);
		ts.add(100);
		ts.add(502);
		ts.add(32);
		ts.add(6);
		ts.add(2);
		ArrayList <Integer> al=new ArrayList <Integer>(ts);
		System.out.println("\nHighest Element :"+al.get(al.size()-1));
		System.out.println("Lowest Element :"+al.get(0));
	}

	public static void main(String[] args) {
		SetTasks o=new SetTasks();
		o.m1();
		o.m2();
		o.m3();
		o.m4();
		o.m5();
	}
}
