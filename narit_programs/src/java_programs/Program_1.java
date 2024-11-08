package java_programs;

public class Program_1 {
	void m1() {
		System.out.println("m1() called");
		Program_1 obj=new Program_1();
		obj.m2();
		System.out.println(10);
	}
	public void m2() {
		System.out.println("m2() called");
		System.out.println(20);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Program_1 obj=new Program_1();
		obj.m1();
		System.out.println("End");
	}

}
