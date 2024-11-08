package Top100InterviewQuestions;

import java.util.Scanner;

public class String_interview_program {

	Scanner sc=new Scanner(System.in);

	//1.Check whether a character is a vowel or consonant 
	public void m1() {
		System.out.println("Enter a Character :");
		char c=sc.next().toLowerCase().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");	
	}

	//--------------------------------------------------------------------------

	//2.A character is an alphabet or not using java
	//A-Z --> 65-90 && a-z --> 97-122
	public void m2() {
		System.out.println("Enter a Character :");
		char c=sc.next().toLowerCase().charAt(0);
		//if((c >= 97 && c <= 122)
		//    (or)
		if(c>='a'&&c<='z') {
			System.out.println("Alphabet");
		}
		else
			System.out.println("Not an Alphabet");	
	}

	//--------------------------------------------------------------------------


	//3.ASCII vzalue of a character
	public void m3() {
		System.out.println("Enter a Character :");
		char c=sc.next().charAt(0);
		int i=c;
		System.out.println("ASCII Value of "+c+" is "+i);

	}

	//--------------------------------------------------------------------------

	//4.Length of the string without using strlen() function 
	public void m4() {
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		int l=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			l++;
		}
		System.out.println("Length of the Given string is : "+l);
	}


	//--------------------------------------------------------------------------

	//5.Toggle each character in a String 
	public void m5() {
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String st="";
		String s1="";

		//1.
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				st+=s.toLowerCase().charAt(i);
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				st+=s.toUpperCase().charAt(i);
			}
		}
		System.out.println("Toggled String is :"+st);

		//2.
		for (int i = 0; i < s.length(); i++) {
			//if (str[i] >= 'A' && str[i] <= 'Z')
			//str[i] = (char)(str[i] + 'a' - 'A');
			//else if (str[i] >= 'a' && str[i] <= 'z')
			//str[i]= (char)(str[i] + 'A' - 'a');

			if(Character.isUpperCase(s.charAt(i))) 
				s1=s1+Character.toLowerCase(s.charAt(i));
			else 
				s1=s1+Character.toUpperCase(s.charAt(i));
		}
		System.out.println("Toggle String is : "+s1);
	}

	//--------------------------------------------------------------------------

	//6.Count the number of vowels 
	public void m6() {
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		int vc=0;
		for(int i=0;i<s.length();i++) {
			char c=s.toLowerCase().charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				vc++;
		}
		System.out.println("Vowel count is : "+vc);	
	}

	//--------------------------------------------------------------------------

	//7.Java Program to Remove Vowels from a String
	public void m7() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String ss="";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.toLowerCase().charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				ss+="";
			else
				ss+=s.charAt(i);		
		}
		System.out.println("Updated String is : "+ss);

		//2.
		s1=ss.replaceAll("[aeiou]","");
		System.out.println("Updated String is : "+s1);
	}

	//--------------------------------------------------------------------------

	//8.Print the given string in reverse order
	public void m8() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String ss="";
		for(int i=s.length()-1;i>=0;i--) {
			ss+=s.charAt(i);
		}
		System.out.println("Reverse String is : "+ss);

		//2.
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println( "String is : "+sb);
		sb.reverse();
		System.out.println("Reversed string is : "+sb);
	}

	//--------------------------------------------------------------------------

	//9.String is a palindrome or not
	public void m9() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String ss="";
		for(int i=s.length()-1;i>=0;i--) {
			ss+=s.charAt(i);
		}
		if(s.equals(ss))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

		StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		if(sb.toString().equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

	//--------------------------------------------------------------------------

	//10.Remove character in a String except alphabet
	public void m10() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String ss="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z' || c>='a' && c<='z' )
				ss+=c;
		}
		System.out.println("Updated String is "+ss);

		//2.
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println("Updated String is "+s);
	}

	//--------------------------------------------------------------------------
	
	public static void main(String[] args) {
		String_interview_program  o=new String_interview_program();
		o.m10();
	}
}
