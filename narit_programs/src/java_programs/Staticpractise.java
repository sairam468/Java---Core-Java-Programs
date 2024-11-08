package java_programs;

public class Staticpractise {

	int c;
	static int e;
	Staticpractise(){
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) {
		int a = 34;
		int b = 21;
		new Staticpractise().c = a++ + ++b;
		int d = --a + --b + new Staticpractise().c--;
		//System.out.println("d="+d);
		e = a+ +b + +new Staticpractise().c +d;
		//System.out.println("e="+e);
		int f = -a + b-- + -new Staticpractise().c - d++;
		//System.out.println("f="+f);
		int sum = a + b + new Staticpractise().c +d + e + f;
		System.out.println("Sum :"+sum);
	}
}
