package java_programs;

public class JTPTM27 {
	
	static int si =222;
	int ij=111;
	
	JTPTM27(){
		System.out.println("-----Default constructor called-----");
		return;
	}
	JTPTM27(int i,String s){
		System.out.println("-----Parameterised constructor called-----");
		return;
	}

	static {
		System.out.println("Static Block Executed");
	}

	int m1(String s) {
		int l1=22;
		int l2=33;

		System.out.println("\nIncrement and Decrement operators");
		int preinc=++l1 + ++l2;
		int posinc=l1+ l2++;
		int predec=--l1 + --l2;
		int posdec=l1--+ l2--;
		System.out.println("preinc :"+preinc+"\nposinc :"+posinc+"\npredec :"+predec+"\nposdec :"+posdec);

		System.out.println("\nArthimetic operator");
		int add=si+ij+2223;
		int sub=JTPTM27.si-ij-12;
		int mul=JTPTM27.si*ij*1156;  //new JTPTM27()
		int div=si/ij/1/2;
		int mod=JTPTM27.si%ij;
		System.out.println("Add :"+add+"\nSub :"+sub+"\nMul :"+mul+"\nDiv :"+div+"\nMod :"+mod);

		System.out.println("\nLogical operator");
		boolean la=l1>0&&l2<0;
		boolean lo=l1>0||l2<0;
		boolean ln=!(l1>0||l2<0);
		System.out.println("LAND :"+la+"\nLOR :"+lo+"\nLNOT :"+ln);

		System.out.println("\nRelational operator");
		boolean ie=l1==l2;
		boolean ine=l1!=l2;
		boolean gt=l1>l2;
		boolean lt=l1<l2;
		boolean gtoe=l1>=l2;
		boolean ltoe=l1<=l2;
		System.out.println("Equal :"+ie+"\nNot Equal :"+ine+"\nIs Greater :"+gt+"\nIs Lesser :"+lt);
		System.out.println("Is Greater or Equal"+gtoe+"Is Lesser or Equal"+ltoe);
		return JTPTM27.m4();
	}

	public void m2() {
		int l=33;
		JTPTM27 o=new JTPTM27();
		System.out.println("\nhashCode() :"+o.hashCode());
		System.out.println("equals() :"+o.equals(new JTPTM27()));
		System.out.println("getClass() :"+o.getClass());;
		System.out.println("toString() :"+o.toString());;
	}

	public int m3(int a) {
		int x=JTPTM27.m4()+a;
		System.out.println("\nImplicit Conversion");
		byte b1=121;
		int i1=b1;
		System.out.println("Before Conversion :"+b1);
		System.out.println("After Conversion"+i1);

		System.out.println("\nExplicit Conversion");
		int i2=121;
		byte b2=(byte)i2;
		System.out.println("Before Conversion :"+i2);
		System.out.println("After Conversion"+b2);
		return x;
	}
	static int m4() {
		System.out.println("\nAuto Boxing");
		int i1=101;
		Integer in1=Integer.valueOf(i1);
		System.out.println("int value :"+i1);
		System.out.println("Integer value :"+in1);

		System.out.println("\nAuto Un-Boxing");
		Integer in2=new Integer(123);
		int i2=in2.intValue();
		System.out.println("Integer value :"+in2);
		System.out.println("int value :"+i2);
		return 111;
	}

	public static void main(String[] args) {
		JTPTM27 o1=new JTPTM27();
		JTPTM27 o2=new JTPTM27(10,"sai");
		o1.m1("Hi");
		o2.m2();
		o2.m3(100);
		JTPTM27.m4();
	}
}
