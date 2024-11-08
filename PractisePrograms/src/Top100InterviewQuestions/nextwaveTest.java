package Top100InterviewQuestions;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class nextwaveTest {
	static Scanner sc=new Scanner(System.in);
	static public void m1() {
		System.out.println("Enter Upper case alphabet");
		String s=sc.next();
		System.out.println(columnNumber(s));
		int sum=0;
		if(s.length()>=1 && s.length()<=10 && s==s.toUpperCase()) {
			for(int i=0;i<s.length();i++) {
				char c=s.charAt(i);
				int j=c-64;
				sum*=26;
				sum+=j;
			}
			System.out.println(sum);
		}
	}
	
	
	public static int columnNumber(String columnLabel) {
		int result= 0;
		for (int i = 0; i < columnLabel.length(); i++) {
			result*=26;
			result += columnLabel.charAt(i) - 'A' + 1;
		}
		
		return result; } 

	public static void m2() {
		int P=sc.nextInt();
		int Q=sc.nextInt();
		int R=sc.nextInt();
		 int flippedCount = countBitsToFlip(P, Q, R);
	        System.out.println("Number of bits to flip: " + flippedCount);




        // Calculate minimum number of bits to flip
        int result = countBitsToFlip(P, Q, R);

        // Output the result
        System.out.println(result);

        
    }

    public static int countBitsToFlip(int p, int q, int r) {
        // Calculate XOR of p and q
        int x = p ^ q;
        
        // Initialize a counter for differing bits
        int bitsToFlip = 0;
        
        // Compare each bit of x with corresponding bit of r
        while (x > 0 || r > 0) {
            if ((x & 1) != (r & 1)) {
                bitsToFlip++;
            }
            x >>= 1;
            r >>= 1;
        }
        
        return bitsToFlip;
    }


        public static void m3() {
            Scanner scanner = new Scanner(System.in);

            // Read the input values
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Calculate the original MEX
            int originalMex = findMex(arr);

            // Check if removing any element changes the MEX
            int changesMex = 0;
            for (int i = 0; i < n; i++) {
                int[] modifiedArr = new int[n - 1];
                for (int j = 0, k = 0; j < n; j++) {
                    if (j != i) {
                        modifiedArr[k++] = arr[j];
                    }
                }
                int newMex = findMex(modifiedArr);
                if (newMex != originalMex) {
                    changesMex = 1;
                    break;
                }
            }

            // Output the result
            System.out.println(changesMex);
            scanner.close();
        }

        public static int findMex(int[] arr) {
            Set<Integer> arrSet = new HashSet<>();
            for (int num : arr) {
                arrSet.add(num);
            }
            int mex = 0;
            while (arrSet.contains(mex)) {
                mex++;
            }
            return mex;
        }
    
    
	
	
    
	

	public static void main(String[] args) {
		
		//m1();
		//m2();
		m3();
		sc.close();
		
	}


}
