package java_programs;

public class Program_6 {

	String m1(int a,int b) {
		System.out.println("m1()");
		System.out.println(54+a-b);
		int value=new Program_6().m5();
		System.out.println(value);
		return "Java";
	}
	int m2(int x) {
		System.out.println("m2()");
		System.out.println(75);
		int y=5;
		System.out.println(y-x);
		return 5*5-y;
	}
	public void m3() {
		System.out.println("m3()");
		System.out.println(new Program_6().m4());
		System.out.println(40);
		
	}
	public String m4() {
		System.out.println("m4()");
		return new Program_6().m1(4, 8);
	}
	int m5() {
		System.out.println("m5()");
		System.out.println(99);
		return new Program_6().m2(5);
	}
	
	public static void main(String[] args) {
		Program_6 o= new Program_6();
		o.m3();
		
}

}
