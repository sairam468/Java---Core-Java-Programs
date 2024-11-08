package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PassUserDefinedObjToSET {

	void m1() {
		HashSet <UserDefObjToALClass> set=new HashSet<UserDefObjToALClass>();
		set.add(new UserDefObjToALClass("sai",10000,"Java"));
		set.add(new UserDefObjToALClass("ram",20000,"Oracle"));
		set.add(new UserDefObjToALClass("Ganta",30000,"Ui"));
		
		System.out.println(set);
	}
	void m2() {
		LinkedHashSet <UserDefObjToALClass> set=new LinkedHashSet<UserDefObjToALClass>();
		set.add(new UserDefObjToALClass("sai",10000,"Java"));
		set.add(new UserDefObjToALClass("ram",20000,"Oracle"));
		set.add(new UserDefObjToALClass("Ganta",30000,"Ui"));
		
		System.out.println(set);
	}
//	void m3() {
//		TreeSet <UserDefObjToALClass> set=new TreeSet<UserDefObjToALClass>();
//		set.add(new UserDefObjToALClass("sai",10000,"Java"));
//		set.add(new UserDefObjToALClass("ram",20000,"Oracle"));
//		set.add(new UserDefObjToALClass("Ganta",30000,"Ui"));
//		
//		System.out.println(set);
//	}
	public static void main(String[] args) {
		PassUserDefinedObjToSET o=new PassUserDefinedObjToSET();
		o.m1();
		o.m2();
		//o.m3();
	}
}
