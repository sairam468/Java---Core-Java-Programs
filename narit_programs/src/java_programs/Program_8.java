package java_programs;

public class Program_8 {
	public String m1() {
		System.out.println("m1()");
		return new Program_8().m3(new Program_8().m2())+" "+ new Program_8().m4("here");
	}
	public int m2() {
		System.out.println("m2()");
		return (25+5);
	}
	public String m3(int a) {
		System.out.println("m3()");
		return "is";
	}
	public String m4(String s) {
		System.out.println("m4()");
		return "Awesome";
	}
	public static void main(String[] args) {
		Program_8 t=new Program_8();
		System.out.println("Java "+t.m1());
	}
}
