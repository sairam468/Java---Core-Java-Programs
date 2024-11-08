package java_programs;

public class Program_4 {
	public void m1(int x,int y,int z) {
		System.out.println("m1()");
		new Program_4().m2("hi",100);
		System.out.println(10+x);
		System.out.println(y);
		System.out.println(10-z);
	}
	void m2(String s,int a) {
		System.out.println("m2()");
		System.out.println(s);
		System.out.println(a-20);
	}
	public void m3(char c,int x,String s) {
		System.out.println("m3()");
		System.out.println('c'+" "+c);
		new Program_4().m1(5,10,6);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		new Program_4().m3('x',50,"hello");
		System.out.println("End");
	}

}
