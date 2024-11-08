package collections;

import java.util.ArrayList;

public class PassUserDefinedObjToAL {
	void m1() {
		ArrayList <UserDefObjToALClass> al =new ArrayList <UserDefObjToALClass>();
		al.add(new UserDefObjToALClass("sai",10000,"Java"));
		al.add(new UserDefObjToALClass("ram",20000,"Oracle"));
		al.add(new UserDefObjToALClass("Ganta",30000,"Ui"));

		for(UserDefObjToALClass o: al) {
			System.out.println(o+" ");
		}
	}
	
	public static void main(String[] args) {
		new PassUserDefinedObjToAL().m1();

	}

}
