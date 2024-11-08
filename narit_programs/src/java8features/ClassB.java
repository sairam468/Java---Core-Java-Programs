package java8features;

public class ClassB {

	public ClassB(){
		System.out.println("ClassB Constructor called");
		this.m1(20);
	}
	int m1(int a) {
		System.out.println("ClassB Method called");
		return a+10;
	}
}
