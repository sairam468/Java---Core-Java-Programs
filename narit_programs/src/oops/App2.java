package oops;

public class App2 extends HourlyEmployee {

 public static void main(String[] args) {

	 HourlyEmployee  a=new App2();
	 /*Here we are calling displayDetails() by giving Employee Name,
	 Employee Id,Salary and Total Number of Hours Worked.*/ 
	 //--By using Employee() we are achieving Abstraction--
	 a.dislpayDetails("starc",3560,22000,6);
	 System.out.println("------------------");
	 a.dislpayDetails("smith",5048,10000,5);
	 System.out.println("------------------");
	 a.dislpayDetails("kane",7560,5000,8);
 }
}
