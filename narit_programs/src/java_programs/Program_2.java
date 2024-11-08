package java_programs;

public class Program_2 {
	public void m1() {
		System.out.println("m1()");
		Program_2 obj=new Program_2();
		obj.m2();
		System.out.println(10+123);
	}
	private void m2() {
		System.out.println("m2()");
		Program_2 obj=new Program_2();
		obj.m3();
		System.out.println(10-478);
	}
	protected void m3() {
		System.out.println("m3()");
		Program_2 obj=new Program_2();
		obj.m4();
		System.out.println(11*22);
	}
	void m4() {
		System.out.println("m4()");
		System.out.println(122/22);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		new Program_2().m1();
		System.out.println("End");
	}
}
