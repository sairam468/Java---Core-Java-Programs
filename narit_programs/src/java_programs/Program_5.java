package java_programs;

public class Program_5 {
	int m1(int a,int b,char c)
	{
		System.out.println(c);
		int result=new Program_5().m2("Java",100,'Y');
		return 10+a+result;
	}
	int m2(String s,int a,char c) {
		System.out.println(s);
		System.out.println(c);
		return 20;
	}
	public static void main(String[] args) {
		System.out.println(new Program_5().m1(10, 20,'X'));
	}
}
