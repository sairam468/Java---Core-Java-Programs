package java_programs;

import java.util.Arrays;

public class arrayPract {
	public static void main(String[] args) {
		arrayPract o = new arrayPract();
		//System.out.println(o.meth2(new int[]{1,2,3}));
		//System.out.println(o.meth2(new int[]{5,5}));
		//System.out.println(o.meth2(new int[]{8,2,1,4}));

		//System.out.println(Arrays.toString(o.meth1()));
		//System.out.println(Arrays.toString(o.meth3(new int[]{8,2,1,4})));

		//o.meth5();

		//int[]a= {1,2,3};
		//int[]b= {4,5,6};
		//int[]result=o.meth6(a,b);
		//System.out.println(Arrays.toString(result));
		
		//System.out.println(Arrays.toString(o.meth7(new int[]{8,2,1,4,16})));
	} 
	int[]meth1() {
		int nums[]= {1,22,323,44};
		int[] rev = new int[nums.length];
		int j=0;
		for(int i=nums.length-1;i>=0;i--,j++){
			rev[j]=nums[i]; 
		}
		return rev;
	}
	int meth2(int [] arr){
		if (arr.length>=2){
			return arr[0]+arr[1];
		}
		else if(arr.length<2 && arr.length!=0)
		{
			return arr[0];
		}
		else{
			return 0;
		}
	}
	int[] meth3(int [] num) {
		int[] newa =new int[num.length*2];
		for(int i=0;i<newa.length;i++){
			if(i==newa.length-1) {
				newa[i]=num[(num.length-1)];
			}}
		return newa;
	}
	void meth4() {
		String s="Sairam";
		int count=0;
		char []ca=s.toLowerCase().toCharArray();
		for(int i=0;i<ca.length;i++) {
			if(ca[i]=='a'||ca[i]=='e'||ca[i]=='i'||ca[i]=='o'||ca[i]=='u') {
				count++;
				System.out.println(ca[i]);
			}
		}
		System.out.println(count);
	}
	void meth5() {
		int a[]= {1,2,3,4,5,6};
		int s=0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
		}
		System.out.println(s);
	}

	int[] meth6(int []n1,int []n2) {
		return new int[] {n1[1],n2[1]};
	}

	int[] meth7(int [] arr){
		int ln=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>ln) {
				ln=arr[i];
			}	
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=ln;
		}
		return arr;
	}
}



