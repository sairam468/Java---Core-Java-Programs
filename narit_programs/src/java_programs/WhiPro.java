package java_programs;

public class WhiPro {

	void m1(int i) {
		int num=1;
		while(num<=10) {
			System.out.println(i+" * "+num+" = "+(i*num));
			num++;
		}
	}
	void m2(int x) {
		while(x<=10) {
			System.out.println("x value is "+ x++ + ++x);}
	}

	void m3(int i) {
		int val=i;
		int num=1;
		do {
			System.out.println(val+" * "+num+" = "+(val*num));
			num++;
			i++;
		}
		while(num<=10);
		
	}
	
	public static void main(String[] args) {
		new WhiPro().m3(122);
	}
}
