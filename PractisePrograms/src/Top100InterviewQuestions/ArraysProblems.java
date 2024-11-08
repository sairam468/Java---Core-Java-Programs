package Top100InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraysProblems {
	static Scanner sc=new Scanner(System.in);
	public void m1() {
		//1.)The largest element of the array
		System.out.println("Enter size of array :");
		int s=sc.nextInt();
		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int l=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>l) {
				l=arr[i];
			}
		}
		System.out.println("largest element is :"+l);
	}

	//----------------------------------------------------------------------------------------------------

	public void m2() {
		//2.)The Smallest element of the array
		System.out.println("Enter size of array :");
		int s=sc.nextInt();
		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int S=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<S)
				S=arr[i];
		}
		System.out.println("Smallest element is :"+s);

	}

	//----------------------------------------------------------------------------------------------------

	public void m3() {
		//3.)The Largest and Smallest element of the array
		System.out.println("Enter size of array :");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int S=arr[0];
		int L=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<S)
				S=arr[i];
			if(arr[i]>L)
				L=arr[i];
		}
		System.out.println("Smallest element is :"+S);
		System.out.println("largest element is :"+L);
		System.out.println(Arrays.toString(arr));
	}

	//----------------------------------------------------------------------------------------------------

	public void m4() {
		//4.)The Second Smallest element of the array
		System.out.println("Enter size of array :");
		int s=sc.nextInt();
		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int S=arr[0];
		int SS=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<S)
				S=arr[i];}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<SS && arr[i]!=S)
				SS=arr[i];
		}	
		System.out.println("Second Smallest element is :"+SS);
	}

	//----------------------------------------------------------------------------------------------------

	public void m5() {
		//5.)sum of all the elements of an array
		System.out.println("Enter size of array :");
		int s=sc.nextInt();
		int sum=0;
		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum is :"+sum);	
	}

	//----------------------------------------------------------------------------------------------------

	public void m6() {
		//6.)Reverse an Array in Java
		System.out.println("Enter size of array :");
		int s=sc.nextInt();

		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int[]rev=new int[arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--,j++) {
			rev[j]=arr[i];
		}
		System.out.println("Revered array :"+Arrays.toString(rev));		
	}

	//----------------------------------------------------------------------------------------------------

	public void m7() {
		//7.)Sort first half in ascending order and second half in descending
		// 1.)1st-method
		System.out.println("Enter size of array :");
		int s=sc.nextInt();

		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length/2;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=arr.length-1;i>=arr.length/2;i--) {
			System.out.print(arr[i]+" ");
		}
		//2.)2nd-method
		System.out.println();
		printOrder(arr,s);

	}


	static void printOrder(int[] a, int n)
	{
		int temp;
		for(int i=0;i < n-1;i++)
		{
			for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
			for(int j = n/2;j < n-1; j++)
			{
				if(a[j] < a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}

	//----------------------------------------------------------------------------------------------------

	public void m8() {
		//8.)Sort the elements in an array
		// 1.)1st-method
		System.out.println("Enter size of array :");
		int s=sc.nextInt();

		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int t;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		//2nd Method
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	//----------------------------------------------------------------------------------------------------

	public void m9() {
		//9.)to find the frequency of elements in an array
		// 1.)1st-method
		System.out.println("Enter size of array :");
		int s=sc.nextInt();

		int[]arr=new int[s];
		System.out.println("Enter elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> Hm=new HashMap<Integer,Integer>();		
		for(int i=0;i<arr.length;i++) {
			if(Hm.containsKey(arr[i])) {
				Hm.put(arr[i],Hm.get(arr[i])+1);
			}
			else
				Hm.put(arr[i],1);
		}
		for(Map.Entry<Integer,Integer> entry:Hm.entrySet()) {
			System.out.println(entry.getKey()+" Occurs "+entry.getValue()+" Times");
		}

		//2.)2nd-method
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int flag=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] ) {
					flag=1;
					break;
				}}
			if(flag==1)
				continue;
			for (int j = 0;j<=i;j++){
				if (arr[i] == arr[j])
					count++;
			}
			System.out.println(arr[i]+": "+count);

		}

		//3.)3rd-method
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int count=1;
			while(i<arr.length-1 && arr[i]==arr[i+1])	{
				i++;
				count++;
			}
			System.out.println(arr[i] + ": " + count);
		}	
	}

	public void m10() {
		//10.)to find the frequency of elements in an array
		// 1.)1st-method
	
		
		
		
	}


	public static void main(String[] args) {
		ArraysProblems o=new ArraysProblems();
		o.m8();
		//System.out.println(Integer.MAX_VALUE);


		//int[] arr= {1,2,3,4,5,6};
		//printOrder(arr,arr.length);

	}

}
