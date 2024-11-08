package Patterns;

public class star_patterns2 {
	
	public void m1() {
		int r=5,i,j;
		for(i=0;i<r;i++) {
			for(j=r;j>i+1;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");	
		}
		
		
	}

	public static void main(String[] args) {
		star_patterns2 o=new star_patterns2();
		o.m1();

	}

}
