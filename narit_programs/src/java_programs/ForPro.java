package java_programs;

public class ForPro {
	void m1(int i) {
		for(System.out.print("SAI"),System.out.println("RAM");i<=10;i++) {
			System.out.println(i);
		}
	}
	void m2() {
		for(int i=new ForPro().m3()-64;i<=5;new ForPro().m4()) {
			System.out.println(i++);
		}}

	int m3() {
		return 'A';
	}
	void m4() {
		System.out.println("----");
	}

	void m5() {
		int i=1;
		int j=5;
		for(;i<=5;i++,j++) {
			System.out.println("i :"+i+"\nj :"+j);
		}
	}

	void m6() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void m7() {
		for(int i=0;i<=5;i++) {
			char c='a';
			for(int j=0;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

	void m8() {
		for(int i=5;i>=0;i--) {
			char c='a';
			for(int j=0;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

	void m9(int noOfRows) {
		for(int i=1;i<=noOfRows;i++) {
			for(int j=noOfRows;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		new ForPro().m9(5);
		//new ForPro().m7();
	}

}
