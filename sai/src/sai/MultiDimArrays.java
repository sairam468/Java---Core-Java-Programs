package sai;

import java.util.Arrays;

public class MultiDimArrays {

	public static void main(String[] args) {
		//sum of all array elements
		int[][] arr= {{1,8,4},
				{9,7,2},
				{7,6,4}};

		int sum=0;
		for (int i = 0; i < arr.length; i++) {	
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("Sum of the array elements is:"+sum);
		System.out.println();
		System.out.println();


		//square of the array elements
		int ar[][]= {{2,3,4},
				{0,1,3},
				{1,2,4}
		};
		int sqar[][]=new int[ar.length][];
		for (int i = 0; i < ar.length; i++) {
			sqar[i]=new int[ar[i].length];
			for(int j=0; j<ar[i].length;j++) {
				sqar[i][j]=(int)(Math.pow((ar[i][j]),2));
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("Square of the array is:");
		for (int i = 0; i < sqar.length; i++) {
			System.out.println(Arrays.toString(sqar[i]));
		}
		System.out.println();
		System.out.println();
		

		//If both elements in two arrays are same the print "1" else "0"
		int[][] be1= {{1,2,1},
				{9,7,2},
				{7,6,4}};

		int[][] be2= {{1,6,1},
				{0,7,3},
				{1,6,4}};
		int[][] Op=new int[be1.length][];
		for (int i=0;i<(be1.length);i++) {
			Op[i]=new int[be1[i].length];
			for(int j=0; j<be1[i].length;j++) {
				if(be1[i][j]==be2[i][j]) {
					Op[i][j]=1;
				}
				else
					Op[i][j]=0;
			}
		}
		System.out.println("Outout array is:");
		for (int i= 0; i < Op.length; i++) {
			System.out.println(Arrays.toString(Op[i]));
		}	
		System.out.println();
		System.out.println();


		//Transpose 
		int[][] t= {{1,8,4},
				{9,7,2},
				{7,6,4}};
		int[][] tr=new int[t.length][];
		for (int i = 0; i < t.length; i++) {
			tr[i]=new int[t[i].length];
			for(int j=0; j<t[i].length;j++) {
				tr[i][j]=t[j][i];
			}
		}
		System.out.println("Transpose of the array is:");
		for (int i= 0; i < tr.length; i++) {
			System.out.println(Arrays.toString(tr[i]));
		}
		System.out.println();
		System.out.println();

		
		//Common elements between two arrays
		int[][] cm1= {{1,2,1},
				{9,7,2},
				{7,6,4}};
		int[][] cm2= {{2,6,8,6},
				{0,1,3,9,7},
				{7,2,0},
				{0,1,2,2,3,4,8,5,6}};
		System.out.println("Input1 is");
		for (int i=0;i<(cm1.length);i++) {
			System.out.println(Arrays.toString(cm1[i]));
		}
		System.out.println("Input2 is");
		for (int i=0;i<(cm2.length);i++) {
			System.out.println(Arrays.toString(cm2[i]));
		}
		boolean isFound=false;
		for(int i=0;i<cm1.length;i++) {
			for(int j=0;j<cm1[i].length;j++) {
				int targetElement=cm1[i][j];
				for(int k=0;k<cm2.length;k++) {
					isFound=false;
					for(int l=0;l<cm2[k].length;l++) {
						if(targetElement==cm2[k][l]) {
							System.out.println(targetElement);
							isFound=true;
							break;
						}
					}
					if(isFound)
						break;
				}

			}
		}

	}
}


