package java_programs;

public class Program_7 {
	int m1(int a,int b) {
		System.out.println("m1()");
		System.out.println(a-b);
		return new Program_7().m4(a-1,"hi");
	}
	String m2(int x) {
		System.out.println("m2()");
		System.out.println(x-new Program_7().m1(200,199));
		return "Java";
	}
	public String m3(int a,int b,String s) {
		System.out.println("m3()");
		System.out.println(a+b+198);
		return s;
	}
	public int m4(int a,String s) {
		System.out.println("m4()");
		return a+a;
	}
	String m5(String s) {
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(new Program_7().m5(new Program_7().m3(15,25,new Program_7().m2(500))));
	}
}


