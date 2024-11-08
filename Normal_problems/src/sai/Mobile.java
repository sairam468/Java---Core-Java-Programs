package sai;

public class Mobile {

	public void call(SimCard sim) {
		System.out.println((sim.getName()).s);
	}
	public static void main(String[] args) {
		Mobile mi=new Mobile();
		mi.call(new JioSim());
	}
}
