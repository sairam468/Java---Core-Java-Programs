package Top100InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class string_interview_programs2 {

	Scanner sc=new Scanner(System.in);

	//------------------------------------------------------------------------------------------------------

	//1.Remove spaces from a string
	public void m1() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String ss="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ')
				ss+=c;
		}
		System.out.println("Updated String is "+ss);

		//2.
		s=s.replaceAll(" ","");
		System.out.println("Updated String is "+s);
	}

	//------------------------------------------------------------------------------------------------------

	//1.Remove Brackets from a string
	public void m2() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String ss="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!='('&&c!=')'&&c!='{'&&c!='}')
				ss+=c;
		}
		System.out.println("Updated String is "+ss);

		//2.
		s=s.replaceAll("[(){}]","");
		System.out.println("Updated String is "+s);
	}

	//------------------------------------------------------------------------------------------------------

	//2.Count the sum of numbers in a string
	//1.Remove spaces from a string
	public void m3() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		int sum=0;
		int summ=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0'&& c<='9')
				sum+=c-'0';  //(or) sum+=c-48;

		}
		System.out.println("Sum is "+sum);

		//2.
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c))
				summ+=Character.getNumericValue(c);  

		}
		System.out.println("Sum is "+summ);
	}

	//------------------------------------------------------------------------------------------------------


	//4.Capitalize the first and last character of each word of a string
	public void m4() {
		//1.
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		System.out.println(Arrays.toString(a));
		String n="";
		//System.out.println(a[1]);
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a[j].length();i++) {
				//a[j].trim();
				char c=a[j].charAt(i);
				if(i==0 || i==a[j].length()-1)
					n+=Character.toString(c).toUpperCase().charAt(0);
				else
					n+=c;

			}
			//n+=" ";
		}
		System.out.println("Sum is :"+n);
	}

	//-------------------------------------------------------------------------------------------------------

	//5.Frequency of each letter of a string
	public void m5() {
		//1.
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		HashMap map=new HashMap();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isAlphabetic(c)){
				if(map.containsKey(c)){
					map.put(c,(int)(map.get(c))+1);
				}else map.put(c,1);
			}
		}

		System.out.println(map);

		//2.

		int[] f=new int[str.length()];
		char[] string=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			f[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(string[i]==string[j]) {
					f[i]++;
					string[j]='0';
				}
			}
		}
		for(int i=0;i<string.length;i++) {
			if(string[i]!='0')
				System.out.println(string[i]+" Frequency is "+f[i]);
		}
	}
	//-------------------------------------------------------------------------------------------------------

	//5.Java Program to find the First non repeating character in a string
	public void m6() {
		//1.
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		boolean f=true;
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(c[i])==str.lastIndexOf(c[i])) {
				System.out.println("First non repeating character in a string is :"+c[i]);
				f=false;
				break;
			}
		}
		if(f)
			System.out.println("no non repeating character");


		//		//2.
		//		LinkedHashMap h=new LinkedHashMap();
		//		int l=str.length();
		//		for(int i=0;i<l;i++) {
		//			char ch=str.charAt(i);
		//			if(h.containsKey(ch)) {
		//				h.put(ch, (int)h.get(ch))+1);
		//			}
		//			else
		//				h.put(ch, 1);
		//		}
		//		for(Entry e : h.entrySet()) {
		//			if(e.getValue()==1) {
		//				System.out.println(e.getKey());
		//			}
		//		}
		//		
	}
	//-------------------------------------------------------------------------------------------------------
	//7.To check if two strings are Anagram or not
	public void m7() {
		int n ;
		do {
			System.out.println("Enter two Strings :");
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			if(str1.length()==str2.length()) {
				char c1[]=str1.toLowerCase().toCharArray();
				char c2[]=str2.toLowerCase().toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				//System.out.println(Arrays.toString(c1));
				//System.out.println(Arrays.toString(c2));
				if(Arrays.equals(c1,c2)) {
					System.out.println(str1+" and "+str2+" are Anagram");
				}
				else
					System.out.println(str1+" and "+str2+" are not Anagram");
			}
			else {
				System.out.println(str1+" and "+str2+" are not Anagram");
			}
			System.out.println("Enter '1' to continue and other to exit ");
			n=sc.nextInt();
		}
		while(n==1);
	}

	//-------------------------------------------------------------------------------------------------------
	//8.Java Program to Replace Substring in a String
	public void m8() {
		System.out.println("Enter The Strings :");
		String OrgStr=sc.nextLine();
		String RepStr=sc.nextLine();
		String RepWithStr=sc.nextLine();
		String ModStr=OrgStr.replaceAll(RepStr, RepWithStr);
		System.out.println("Original String is :"+OrgStr);
		System.out.println("Modified String is :"+ModStr);

	}
	//-------------------------------------------------------------------------------------------------------
	//9.To Replace a Particular Word by Another Word From a Given String
	public void m9() {
		System.out.println("Enter The Strings :");

		String str = sc.nextLine();

		String word = sc.nextLine();

		str = str.replaceAll(word, "");
		str = str.trim();

		// Printing the final string
		System.out.print(str);

	}
	//-------------------------------------------------------------------------------------------------------
	//10.Count common sub-sequence in two strings
	public void m10() {
		System.out.println("Enter The Strings :");
		String s = sc.nextLine();
		String t =sc.nextLine() ;       
		int n1 = s.length(); 
		int n2 = t.length(); 
		int dp[][] = new int [n1+1][n2+1]; 
		char ch1,ch2 ; 
		for (int i = 0; i <= n1; i++) { 
			for (int j = 0; j <= n2; j++) { 
				dp[i][j] = 0; 
			} } 
		for (int i = 1; i <= n1; i++) { 
			for (int j = 1; j <= n2; j++) { 
				ch1 = s.charAt(i - 1); 
				ch2 = t.charAt(j - 1); 

				if (ch1 == ch2) 
					dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j]; 
				else
					dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1]; 
			} }
		System.out.println((dp[n1][n2]));
	}

	//-------------------------------------------------------------------------------------------------------

	//11.Check if two strings match where one string contains wildcard characters
	public void m11() {

		System.out.println("Enter String containing wild Charcater");
		String wild = sc.next();
		System.out.println("Enter String to be matched");
		String str = sc.next();
		boolean flagA = true, flagB = false;
		int m = wild.length(), n = str.length();
		boolean check[][] = new boolean[m + 1][n + 1];
		check[0][0] = true;
		for (int i = 1; i <= n; i++) check[0][i] = false;
		for (int i = 1; i <= m; i++) {
			if (wild.charAt(i - 1) == '*')
				check[i][0] = check[i - 1][0];
			else
				check[i][0] = false;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				if (wild.charAt(i - 1) == str.charAt(j - 1))
					check[i][j] = check[i - 1][j - 1];
				else if (wild.charAt(i - 1) == '?')
					check[i][j] = check[i - 1][j - 1];
				else if (wild.charAt(i - 1) == '*')
					check[i][j] = check[i - 1][j] || check[i][j - 1];
				else
					check[i][j] = false;
			}}
		if (check[m][n])
			System.out.println("true");
		else
			System.out.println("false");
	}

	//-------------------------------------------------------------------------------------------------------

	//12.Print all permutations of a given string in lexicographically sorted order
	static int m12(char[] str, char first, int l,int h){
		// initialize index of ceiling element
		int ceilIndex = l;

		// Now iterate through rest of the elements and find
		// the smallest character greater than 'first'
		for (int i = l + 1; i <= h; i++)
			if (str[i] > first && str[i] < str[ceilIndex])
				ceilIndex = i;
		return ceilIndex;
	}

	// Print all permutations of str in sorted order
	static void sortedPermutations(char[] str)
	{
		// Get size of string
		int size = str.length;

		// Sort the string in increasing order
		Arrays.sort(str);

		// Print permutations one by one
		boolean isFinished = false;
		while (!isFinished) {
			// print this permutation
			System.out.println(String.valueOf(str));

			// Find the rightmost character which is
			// smaller than its next character.
			// Let us call it 'first char'
			int i;
			for (i = size - 2; i >= 0; --i)
				if (str[i] < str[i + 1])
					break;

			// If there is no such character, all are
			// sorted in decreasing order, means we
			// just printed the last permutation and we are
			// done.
			if (i == -1)
				isFinished = true;
			else {
				// Find the ceil of 'first char' in
				// right of first character.
				// Ceil of a character is the smallest
				// character greater than it
				int ceilIndex = m12(str, str[i], i + 1,
						size - 1);

				// Swap first and second characters
				char temp = str[i];
				str[i] = str[ceilIndex];
				str[ceilIndex] = temp;

				// Sort the string on right of 'first char'
				Arrays.sort(str, i + 1, size);
			}
		}
	}



//-------------------------------------------------------------------------------------------------------

public static void main(String[] args) {
	string_interview_programs2  o= new string_interview_programs2();
	//o.m11();
	
	char[] str = { 'A', 'B', 'C', 'D' };
	sortedPermutations(str);

	//			char c='0';
	//			int i=c;
	//			System.out.println(i);
}
}




