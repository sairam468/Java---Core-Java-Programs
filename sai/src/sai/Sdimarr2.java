package sai;

import java.util.Arrays;
import java.util.Iterator;

public class Sdimarr2 {

	public static void main(String[] args) {
		//Max element in a array
		int arr[]= {2,5,1,9,6};
		int max =0;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		System.out.println("maximum number is :"+max);
		System.out.println("index is :"+index);
		System.out.println();
		
		
		//Mix length element in a array
		String arr2[]= {"cofee","water","chai","coke","tea"};
		String min=arr2[0];
		int indexx=0;
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i].length()<min.length()) {
				min=arr2[i];
				indexx=i;
			}
		}
		System.out.println("minimum word is :"+min);
		System.out.println("index is :"+indexx);
		System.out.println();
	
		
		//Reverse of array
		String a3[]= {"true1","false1","false2","true2","false3","true3",};
		String revarr[]=new String[a3.length];
		for(int i=0;i<a3.length;i++) {
			revarr[a3.length-i-1]=a3[i];
		}
		for(int i=0;i<revarr.length;i++) {
			System.out.print(revarr[i]+"  ");
		}

}
}