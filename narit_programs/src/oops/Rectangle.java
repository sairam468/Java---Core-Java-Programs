package oops;

public class Rectangle extends shape {

	@Override
	public int calculateArea(int l,int b)
	//calculating Rectangle area by giving length 
	//and breadth as parameters for the method
	{
		int area=l*b;
		return area;
	}
}
