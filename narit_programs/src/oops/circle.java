package oops;

public class circle extends shape {

	@Override
	public int calculateArea(int r1, int r2)
	//calculating Circle area by giving radius 
   //as parameters for the method
	{
		int area=(int)(3.14*r1*r2);
		return area;
	}

	
}
