package java_programs;

public class la3s {
	public static void main(String[] args) {
		int[] a= new int[]{1,2,3,4,5,6,64546,5,224,464646,65416156,54654654};
		int h=0;
		int sh=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>h) {
				h=a[i];
			}
	}
	for(int j=0;j<a.length;j++) {
			if(a[j]!=h && a[j]>sh) {
				sh=a[j];
	}
}
		System.out.println("Highest "+h);
		System.out.println("second Highest "+sh);
	}
}

			
	
	
	
	
	

