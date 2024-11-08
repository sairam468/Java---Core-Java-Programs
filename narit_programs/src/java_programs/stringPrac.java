package java_programs;

public class stringPrac {

	public void m1(String a){    //palindrome
		String rev="";
		for(int i=a.length()-1;i>=0;i--){
			rev+=a.charAt(i);
		}
		if(rev.equalsIgnoreCase(a))
			System.out.println("Given Word is palindrome");
		else
			System.out.println("Given Word is not palindrome");
	}


	public String makeOutWord(String out,String word) {
		String s= out.substring(0,2)+word+out.substring(2);
		return s;
	}

	public String extraEnd(String str) {
		String s=str.substring(str.length()-2);
		//String s=str.substring(str.length()-2,str.length());
		return s+s+s;
	}

	public String firstTwo(String str) {
		if(str.length()>=2) {
			String s=str.substring(0,2);
			//String s=str.substring(str.length()-2,str.length());
			return s;
		}
		else
			return str;	
	}

	public String firstTHalf(String str) {
		if(str.length()%2==0) {
			return str.substring(0, str.length()/2);
		}
		else
			return "Str length is not even";	
	}


	public String doubleChar(String str) {
		String s="";
		for(int i=0;i<str.length();i++){
			s+=str.charAt(i);
			s+=str.charAt(i);
		}
		return s;
	}


	public boolean frontAgain(String str) {
		if(str.substring(0,2).equals(str.substring(str.length()-2)))
			return true;
		return false;
	}

	public int countHi(String str) {
		char[]c=str.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++){
			if(i!=c.length-1 && c[i]=='h' && c[i+1]=='i')
				count++;
		}
		return count;
	}
	
	public int countCode(String str) {
		char[]c=str.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++){
			if(c.length>3 && i<=c.length-4  && c[i]=='c' && c[i+1]=='o' && c[i+3]=='e')
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(0/5);
		stringPrac o=new stringPrac();
		//new stringPrac().m1("nitin");
		//System.out.println(o.makeOutWord("<<>>","SAI"));
		//System.out.println(o.extraEnd("sairam"));
		//System.out.println(o.firstTwo("s"));
		//System.out.println(o.firstTHalf("sairam"));
		//System.out.println(o.doubleChar("sairam"));
		//System.out.println(o.frontAgain("edited"));
		//System.out.println(o.countHi("hirasaihihih"));
		//System.out.println(o.countCode("cooeddhchvecogedcoeedcodecodecode"));


	}
}
