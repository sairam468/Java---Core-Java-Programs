package oops;

public class classB extends Rectangle {

	public static void main(String[] args) {
		Rectangle r=new classB();
		int result=r.calculateArea(10, 20);
		System.out.println("Area of rectangle is :"+result);

	}

}
