package oops;

public class salariedEmployee implements Employee {

	@Override
	public double calculateSalary(int M,int S) {
		//Here 'M' describes number of months employee worked 
		//and 'S' is the Salary of that employee
		double totalSalary=M*S;
		return totalSalary;
	}
	@Override
	public void dislpayDetails(String Name,int EmployeeId,int Salary,int numberOfMonthsWorked) {
		System.out.println("Employee Name is "+Name);
		System.out.println("Employee Id is "+EmployeeId);
		System.out.println("Employee Salary is "+Salary);
		System.out.println("Employee Worked months "+numberOfMonthsWorked);
		System.out.println("Employee total salary is "+this.calculateSalary(numberOfMonthsWorked,Salary));
	}
}
