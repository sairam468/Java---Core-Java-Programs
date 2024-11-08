package sai;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimarray {


			public static void main(String[] args) {
				//Sum of two array elements
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter row size in array 1:");
				int rowSize1 = scanner.nextInt();
				int arr1[][] = new int[rowSize1][];
				for (int i = 0; i < rowSize1; i++) {
					System.out.println("enter column size of array 1:" + i);
					int colsize1 = scanner.nextInt();
					arr1[i] = new int[colsize1];
					System.out.println("enter column value for the row " + i);
					for (int j = 0; j < colsize1; j++) {
						arr1[i][j] = scanner.nextInt();
					}
				}
				System.out.println("enter row size in array 2:");
				int rowSize2 = scanner.nextInt();
				int arr2[][] = new int[rowSize2][];
				for (int i = 0; i < rowSize2; i++) {
					System.out.println("enter column size of array 2:" + i);
					int colsize2 = scanner.nextInt();
					arr2[i] = new int[colsize2];
					System.out.println("enter column value for the row " + i);
					for (int j = 0; j < colsize2; j++) {
						arr2[i][j] = scanner.nextInt();
					}
				}
				System.out.println("Input 1");
				for (int i = 0; i < arr1.length; i++) {
					System.out.println(Arrays.toString(arr1[i]));
				}
				System.out.println("Input 2");
				for (int i = 0; i < arr2.length; i++) {
					System.out.println(Arrays.toString(arr2[i]));
				}
				int arr3[][] = new int[arr1.length][];
				for (int i = 0; i < arr1.length; i++) {
					arr3[i] = new int[arr1[i].length];
					for (int j = 0; j < arr1[i].length; j++) {
						arr3[i][j] = arr1[i][j] + arr2[i][j];
					}
				}
				System.out.println("output");
				for (int i = 0; i < arr3.length; i++) {
					System.out.println(Arrays.toString(arr3[i]));
				}

				scanner.close();

			}


}

