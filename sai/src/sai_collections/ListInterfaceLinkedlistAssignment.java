package sai_collections;

import java.util.*;

public class ListInterfaceLinkedlistAssignment {

	public static void main(String[] args) {
		//Splitting of the list
		List <Integer> l=new ArrayList<>();
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		l.add(66);
		l.add(77);
		l.add(88);
		List <Integer> l1=new ArrayList<>(l.size()/2);
		List <Integer> l2=new ArrayList<>(l.size()/2);
		System.out.println(l);
		for(int i=0;i<l.size()/2;i++) {
			l1.add(l.get(i));	
		}
		for(int i=l1.size();i<l.size();i++) {
			l2.add(l.get(i));	
		}
		System.out.println(l1);
		System.out.println(l2);
		System.out.println();
		System.out.println();


		//Merging of the list
		List <Integer> al1=new ArrayList<>();
		List <Integer> al2=new ArrayList<>();
		al1.add(11);
		al1.add(22);
		al1.add(33);
		al1.add(44);
		al2.add(55);
		al2.add(66);
		al2.add(77);
		al2.add(88);
		System.out.println(al1);
		System.out.println(al2);
		List <Integer> al=new ArrayList<>();
		for(int i=0;i<al1.size();i++) {
			al.add(al1.get(i));	
		}
		for(int i=0;i<al2.size();i++) {
			al.add(al2.get(i));	
		}
		System.out.println(al);
	}
}
