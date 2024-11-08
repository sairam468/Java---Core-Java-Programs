package oops;

public class App1 extends salariedEmployee{
	
 public static void main(String[] args) {

	 salariedEmployee a=new App1();
	 /*Here we are calling displayDetails() by giving Employee Name,
	 Employee Id,Salary and Total Number of months Worked.*/ 
	 //--By using Employee() we are achieving Abstraction--
	 a.dislpayDetails("Rahul",4560,25000,10);
	 System.out.println("------------------");
	 a.dislpayDetails("Virat",6048,30000,12);
	 System.out.println("------------------");
	 a.dislpayDetails("Rohit",9560,15000,8);
 }
}
