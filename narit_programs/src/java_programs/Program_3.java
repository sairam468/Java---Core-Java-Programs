package java_programs;

public class Program_3 {
	public void m1() {
		System.out.println("m1()");
		int i=111;
		System.out.println(i);
		System.out.println(i+i);
		System.out.println("i");
	}
	void m2() {
		System.out.println("m2()");
		int i=222;
		System.out.println("i : "+i);
		new Program_3().m1();
		System.out.println(i-2);
		System.out.println(i/22);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		new Program_3().m2();
		System.out.println("End");
	}
}



