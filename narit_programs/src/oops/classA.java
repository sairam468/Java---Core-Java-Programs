package oops;

public class classA extends circle{

	public static void main(String[] args) {
		circle c=new classA();
		int r=10;
		int result=c.calculateArea(r,r);
		System.out.println("Area of circle is :"+result);
	}

}
