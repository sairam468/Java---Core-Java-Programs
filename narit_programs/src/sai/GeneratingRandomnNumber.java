package sai;

import java.lang.Math;
import java.util.Random; //automatically imported
import java.util.concurrent.ThreadLocalRandom;

public class GeneratingRandomnNumber {

	public void m1() {
		//using  random()--->public static double random()  
		// Generating random numbers  
		System.out.println("1st Random Number: " + Math.random());   

		int min = 200;  
		int max = 400;  
		//Generate random double value from 200 to 400   
		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double a = Math.random()*(max-min+1)+min;   
		System.out.println(a);  
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);
	}

	public void m2() {
		//using  Random class
		// Generating random numbers 
		// creating an object of Random class   
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int x = random.nextInt(50);   
		// Generates random integers 0 to 999  
		int y = random.nextInt(1000);   
		// Prints random integer values  
		System.out.println("\n\nRandomly Generated Integers Values");  
		System.out.println(x);   
		System.out.println(y);   
		// Generates Random doubles values  
		double a = random.nextDouble();   
		double b = random.nextDouble();   
		// Prints random double values  
		System.out.println("Randomly Generated Double Values");  
		System.out.println(a);   
		System.out.println(b);    
		// Generates Random float values  
		float f=random.nextFloat();  
		float i=random.nextFloat();  
		// Prints random float values  
		System.out.println("Randomly Generated Float Values");  
		System.out.println(f);   
		System.out.println(i);   
		// Generates Random Long values  
		long p = random.nextLong();   
		long q = random.nextLong();   
		// Prints random long values  
		System.out.println("Randomly Generated Long Values");  
		System.out.println(p);   
		System.out.println(q);    
		// Generates Random boolean values  
		boolean m=random.nextBoolean();  
		boolean n=random.nextBoolean();  
		// Prints random boolean values  
		System.out.println("Randomly Generated Boolean Values");  
		System.out.println(m);   
		System.out.println(n);   
	}   
	
	public void m3() {
		//Using the ThreadLocalRandom Class
		// Generate random integers between 0 to 999   
		int a = ThreadLocalRandom.current().nextInt();   
		int b = ThreadLocalRandom.current().nextInt();   
		// Print random integer values  
		System.out.println("Randomly Generated Integer Values:");  
		System.out.println(a);   
		System.out.println(b);   
		// Generate Random double values  
		double c = ThreadLocalRandom.current().nextDouble();   
		double d = ThreadLocalRandom.current().nextDouble();   
		// Print random doubles   
		System.out.println("Randomly Generated Double Values:");  
		System.out.println(c);   
		System.out.println(d);   
		// Generate random boolean values  
		boolean e = ThreadLocalRandom.current().nextBoolean();   
		boolean f = ThreadLocalRandom.current().nextBoolean();   
		// Print random Booleans   
		System.out.println("Randomly Generated Boolean Values:");  
		System.out.println(e);   
		System.out.println(f); 
}
	public static void main(String[] args) {
		GeneratingRandomnNumber o=new GeneratingRandomnNumber();
		o.m1();
		o.m2();
	}	
}



