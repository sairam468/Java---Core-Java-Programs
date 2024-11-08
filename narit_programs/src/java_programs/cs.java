package java_programs;
public class cs{
	public String m1(int a,int b){
		int x=20;
		cs o=new cs();
		int y=new cs().m2(20,"hi");
		System.out.println("m1");
		System.out.println(x+y+111);
		return "x+y";}
	int m2(int c,String s) {
		String s1=s;
		int d=c+5;
		System.out.println("m2");
		System.out.println(s1+" how are you");
		return d;}
	public String m3(int x,int y){
		System.out.println("m3");
		int a=(new cs().m2(12,"hel"+"lo"));
		System.out.println(new cs().m4("fine",5)+a);
		return new cs().m1(x,y);}
	int m4(String s,int d)
	{
		System.out.println("m4");
		System.out.println(s);
		return 155;
		}
public static void main(String[] args) {
	new cs().m3(20,10);
	new cs().m4("fine",5);
}
}


