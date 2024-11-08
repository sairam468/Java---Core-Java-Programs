package oops;

public class HourlyEmployee implements Employee {

	@Override
	public double calculateSalary(int H,int S) {
		//Here 'H' describes number of hours employee worked 
		//and 'S' is the Salary of that employee
		double totalSalary=H*S;
		return totalSalary;
	}
	@Override
	public void dislpayDetails(String Name,int EmployeeId,int Salary,int numberOfHoursWorked) {
		System.out.println("Employee Name is "+Name);
		System.out.println("Employee Id is "+EmployeeId);
		System.out.println("Employee Salary is "+Salary);
		System.out.println("Employee Worked Hours "+numberOfHoursWorked);
		System.out.println("Employee total salary is "+this.calculateSalary(numberOfHoursWorked,Salary));
	}
}
