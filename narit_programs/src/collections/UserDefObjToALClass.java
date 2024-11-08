package collections;

public class UserDefObjToALClass {

	private String empName;
	private int empsal;
	private String empDept;
	public  UserDefObjToALClass(String empName,int empsal,String empDept) {
		this.empName=empName;
		this.empDept=empDept;
		this.empsal=empsal;
	}
	@Override
	public String toString() {
		return empName+" "+empDept+" "+empsal;
	}
	
}
