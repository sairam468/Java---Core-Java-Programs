package sai;

import java.util.*;

public class StringPrograms {
	public static void main(String[] args) {
		//		Scanner sc =new Scanner(System.in);
		//		System.out.println("Enter the string:");
		//		String s=sc.nextLine();
		//      sc.close();

		//1.)Number of Characters in the string
		String s1="java is super";
		System.out.println("1.)The Number of Characters in the string is: "+s1.length());
		System.out.println();


		//2.)Number of words in the string
		String s2="java is super";
		String split[]=s2.split(" ");
		System.out.println("2.)The Number of Characters in the string is: "+split.length);
		//		System.out.println(Arrays.toString(split));
		System.out.println();


		//3.)To count the number of occurrence of character in the string
		String s3="Hello World";
		char targetCharacter='l';
		int count=0;
		for(int i=0;i<s3.length();i++) {
			if(s3.charAt(i)==targetCharacter) {
				count++;
			}
		}
		System.out.println("3.)The number of occurrence of character in the string : "+count);
		System.out.println();


		//4.)Print the vowels in the string
		String s4="Ganta lakshman Naga Durga Sairam";
		String ss=s4.toLowerCase();
		int countt=0;
//		for(int i=0;i<ss.length();i++) {
//			char sss=ss.charAt(i);
//			if(sss=='a'||sss=='e'||sss=='i'||sss=='o'||sss=='u') {
//				countt++;
//			}
//		}
//		char c[]=s4.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			char sss=c[i];
//			if(sss=='a'||sss=='e'||sss=='i'||sss=='o'||sss=='u') {
//				countt++;
//			}
//		}
		
		String s44="aeiou";
		for(int i=0;i<s4.length();i++) {
			for(int j=0;j<s44.length();j++) {
				if(ss.charAt(i)==s44.charAt(j))
					countt++;
			}
		}
		
		
		System.out.println("4.)The number of vowels in the string are : "+countt);
		System.out.println();


		//5.)Reverse a string
		String s5="Ganta lakshman Naga Durga Sairam";
		String rev5="";
		for(int i=s5.length()-1;i>=0;i--) {
			rev5+=s5.charAt(i);
		}
		System.out.println("5.)Reversed string is : "+rev5);
		System.out.println();


		//6.)Removing all starting and ending spaces in the string
		String s6="    Ganta lakshman Naga Durga Sairam  ";
		String ss6 = s6.trim();
		System.out.println("6.)Trimmed string is : "+ss6);
		System.out.println();


		//7.)To reverse each word in the string
		String s7="Ganta lakshman Naga Durga Sairam";
		String sw7[]=s7.split(" ");

		String rev7=" ";
		for(int i=0;i<sw7.length;i++) {
			String word = sw7[i];
			String revword7=getReverseString(word);
			//			for(int j=word.length()-1;j>=0;j--) {
			//				revword7+=word.charAt(j);
			//			}
			//			if(i!=sw7.length-1&&i!=0)
			//				rev7+=revword7+" ";
			//			else
			//				rev7+=revword7;
			rev7+=revword7+" ";
		}
		System.out.println("7.)reversed word in the string is :"+rev7.trim()); //by using method
		System.out.println();


		//8.)Change odd Words to uppercase and Reverse the even words in a string
		String s8="java is super easy";
		String word8="";
		String sw8[]=s8.split(" ");
		//		System.out.println(Arrays.toString(sw8));
		for(int i=0;i<sw8.length;i++) {
			if(i%2==0) {
				word8+=getReverseString(sw8[i]);
			}
			else {
				word8+=sw8[i].toUpperCase();
			}
			if(i!=sw8.length-1) {
				word8+=" ";
			}
		}
		System.out.println("8.)Change odd uppercase and Reverse even in string :"+word8.trim());
		System.out.println();


		//9.)To find count of uppercase,lowercase,digits and special characters 
		String s9="Ganta lakshman Naga Durga Sairam";
		int uc=0;
		int lc=0;
		int dc=0;
		int scc=0;
		char[] character=s9.toCharArray();
		for(char ch:character) {
			if(Character.isUpperCase(ch)) 
				uc++;
			else if(Character.isLowerCase(ch))
				lc++;
			else if(Character.isDigit(ch))
				dc++;
			else
				scc++;
		}
		System.out.println("9.)count of uppercase,lowercase,digits and special characters is: ");
		System.out.print(uc+" "); 
		System.out.print(lc+" ");
		System.out.print(dc+" "); 
		System.out.println(scc+" ");
		System.out.println();


		//10.)To find first repeated and non repeated character in the string
		String s10="ganta lakshman Naga Durga Sairam";
		char firstRepeatesCharacter=' ';
		char firstnonRepeatesCharacter=' ';
		for(int i=0;i<s10.length();i++) {
			char tempChar=s10.charAt(i);
			if(tempChar!=' ') {
				if(s10.indexOf(tempChar)==s10.lastIndexOf(tempChar)) {
					if(firstnonRepeatesCharacter==' ')
						firstnonRepeatesCharacter=tempChar;
				}
				else if(firstRepeatesCharacter==' '){
					firstRepeatesCharacter=tempChar;
					if(firstnonRepeatesCharacter!=' '&&firstRepeatesCharacter!=' ') {
						break;
					}
				}
			}
		}
		System.out.println("10.)First repeated and non repeated character in the string are :");
		System.out.println("First repeated character is: "+firstRepeatesCharacter);
		System.out.println("First non repeated character is: "+firstnonRepeatesCharacter);
		System.out.println();


		//11.)To create an array of odd positions in string
		String s11="ganta lakshman Naga Durga Sairam";
		String c11[]=s11.split(" ");
		String c111[]=new String[c11.length/2];
		int index=0;
		for(int i=0;i<c11.length;i++) {
			if(i%2!=0) {
				c111[index]=c11[i];
				index++;
			}
		}
		System.out.println("11.)Created an array of odd positions in string :"+Arrays.toString(c111));
		System.out.println();


		//12.)To find max length word in the string
		String s12="ganta lakshman Naga Durga Sairam";
		String c12[]=s11.split(" ");
		String maxLengthWord=c12[0];
		for(int i=0;i<c12.length;i++) {
			if(maxLengthWord.length()<c12[i].length()) {
				maxLengthWord=c12[i];
			}	
		}
		System.out.println("12.)Max length word in the string :"+maxLengthWord);	
		System.out.println();


		//13.)Compare two strings if same char else "+"
		String s13_1="New York";
		String s13_2="NWYR";
		String op=" ";
		for(int i=0;i<s13_1.length();i++) {
			char c13=s13_1.toLowerCase().charAt(i);
			if(s13_2.toLowerCase().indexOf(c13)>=0) {
				op+=s13_1.charAt(i);
			}
			else
				op+='+';
		}
		System.out.println("13.)Compare two strings :"+op);	
		System.out.println();



		//14.)To print last name first and followed by "," and first name first char
		String fn="Lakshman Naga durga Sairam";
		String ln="Ganta";
		String []c=fn.split(" ");
		String ssn="";
		for(int i=0;i<c.length;i++) {
			if(i==c.length-1)
				ssn+=c[i].charAt(0);
			else
				ssn+=c[i].charAt(0)+".";
		}
		System.out.println("14.)To print last name first and first name first char :"+ln+"."+ssn);
		System.out.println();

		//15.)To print the file name extension
		String s="Resume.pdf";
		String os=" ";
		os=s.substring(s.lastIndexOf(".")+1,s.length());
		System.out.println("15.)printing the file name extension : "+os);
		System.out.println();


		//16.)Palindrome
		String s116="nitin";
		//		String revs16="";
		//		for(int i=s116.length()-1;i>0;i--) {
		//			revs16+=s116.charAt(i);
		//		}
		System.out.print("16.)");
		if(getReverseString(s116).equals(s116)) {
			System.out.println("Given word is a Palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

	private static String getReverseString(String inputString) {
		String reversestring=new String();
		for(int j=inputString.length()-1;j>=0;j--) {
			reversestring+=inputString.charAt(j);
		}
		return reversestring;
	}

}
