package oops;

public class EncapClassA {

	private String empName;
	private int empSalary;
	private int empExperience;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}
	
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		if(this.empExperience>=10) {
		this.empSalary = empSalary+(empSalary*30/100);
		}
		else
			this.empSalary = empSalary+(empSalary*10/100);
	}
	
	
}
