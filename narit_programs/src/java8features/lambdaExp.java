package java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Arrays;

public class lambdaExp {
	public void m1() {
		InterfaceA x =(int y,int z)->{
			return y+z;
		};
		System.out.println("x :"+x.m1(99, 1));
		System.out.println("-------------------");

		//---------------------------------------------------------

		InterfaceB y=(int a,ArrayList <Integer> al)->{
			int sum =0;
			Iterator <Integer> i=al.iterator();
			while(i.hasNext()){
				sum+=i.next();
			}
			sum+=a;
			System.out.println("sum is :"+sum);
		};
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(10); al.add(20); al.add(30); al.add(40);
		y.m1(50, al);
		System.out.println("-------------------");

		//---------------------------------------------------------

		Interface z=(int a,String s,char c)->{
			System.out.print("Your Password is ");
			return s+c+a;
		};
		System.out.println(z.m2(468, "Sairam Ganta",'@'));
		System.out.println("-------------------");

		//---------------------------------------------------------


		InterfaceC S=(int a,ClassB b)->{
			int r=b.m1(20)+a;
			System.out.println("result is :"+r);
		};
		S.m3(10,new ClassB());
		System.out.println("-------------------");

		//---------------------------------------------------------
		
		InterfaceD A=(HashMap<Integer,Integer> map,ArrayList<Integer> all)->{
			int r=map.get(1)+all.get(0)+map.get(2)+all.get(1)+map.get(3)+all.get(2);
			System.out.println("result is :"+r);
			
		};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1,123); map.put(2,456); map.put(3,789);
		
		ArrayList<Integer> all =new ArrayList<Integer>();
		all.add(10); all.add(20); all.add(30);
		
		A.m4(map, all);

		System.out.println("-------------------");

		//---------------------------------------------------------

		InterfaceE I=(int arr[],TreeSet<Integer> ts)->{
			System.out.println("ts :"+ts);
			int[] ar=new int[arr.length+ts.size()];

			ArrayList<Integer> alll =new ArrayList<Integer>(ts);
			
			int i=0;
			for(;i<alll.size();i++) {
				ar[i]=alll.get(i);
			}
			for(int j=0;i<ar.length;j++,i++) {
				ar[i]=ar[j];
			}
			
			return ar; 
		};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(99); ts.add(77); ts.add(33); ts.add(11); ts.add(55);
		
		int arr[]= {1,3,5,7,9};
		int[] r=I.m5(arr,ts);
		System.out.println("arr is : "+Arrays.toString(r));

	}





	public static void main(String[] args) {
		new lambdaExp().m1(); 
	}



}
