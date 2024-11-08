package sai;

public class JioSim extends SimCard {

	String s="Jio";
	
	@Override
	public JioSim getName() {
		System.out.println("Jio-class");
		return new JioSim();
	}
}
