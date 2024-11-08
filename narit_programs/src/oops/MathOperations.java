package oops;
public class MathOperations {
	public int addNumbers(int a,int b) { //This method takes two integer numbers as parameters and return their sum.
		int sum=a+b;
		return sum;
	}
	public double addNumbers(double a,double b) { //This method takes two double numbers as parameters and return their sum.
		double sum=a+b;
		return sum;
	}
	public String addNumbers(String a,String b) { ////This method takes two Strings as parameters and return their concatenated value..
		String con = a.concat(b);
		return con;
	}
	public int addNumbers(int[] numbers) {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		MathOperations o=new MathOperations();
		System.out.println("sum of 5 and 7 : "+o.addNumbers(5, 7));
		System.out.println("sum of 3.5 and 2.5 : "+o.addNumbers(3.5,2.5));
		System.out.println("concatenation of Hello and Java : "+o.addNumbers("Hello","Java"));
		System.out.println("sum of numbers in array : "+o.addNumbers(new int[] {1,2,3,4,5,6,7,8,9}));
	}
}
