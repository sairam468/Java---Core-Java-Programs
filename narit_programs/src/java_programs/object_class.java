package java_programs;

public class object_class 
{
	protected void finalize() {
		System.out.println("\nGarbage is Collected");
	}
	public static void main(String[] args) 
	{
		object_class o=new object_class();
		System.out.println(o);
		System.out.println(o.hashCode());
		System.out.println(o.equals(o));
		System.out.println(o.getClass());
		System.out.println(o.toString());

		
		object_class o1=new object_class();
		new object_class();
		o1=null;
		System.gc();
	}

}
