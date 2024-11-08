package Patterns;
import java.util.Scanner;

public class Pattern {


	static Scanner s=new Scanner(System.in);
	public void m1() {

        System.out.println("Enter a number :");
		int r=s.nextInt();
		for(int i=r;i>=0;i--) {
			for(int j=r;j>=0;j--) {
				if(i<=j)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void  m2() {
		boolean pattern[][]=new boolean[7][17];
		pattern[0][2] = true; pattern[0][5] = true; pattern[0][10] = true; pattern[0][14] = true;
		pattern[1][1] = true; pattern[1][6] = true; pattern[1][11] = true; pattern[1][15] = true;
		pattern[2][0] = true; pattern[2][7] = true; pattern[2][12] = true; pattern[2][16] = true;
		pattern[3][1] = true; pattern[3][8] = true; pattern[3][13] = true; pattern[3][15] = true;
		pattern[4][2] = true; pattern[4][9] = true; pattern[4][12] = true; pattern[4][14] = true;
		pattern[5][3] = true; pattern[5][10] = true; pattern[5][11] = true; pattern[5][13] = true;
		pattern[6][4] = true; pattern[6][11] = true; pattern[6][12] = true; pattern[6][14] = true;


		
		for (int i = 0; i < 7; i++) {
		    for (int j = 0; j < 17; j++) {
		        if (pattern[i][j]) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}

	}
	
	public void m3() {
		        int rows = 5;

		        // Print 'S'
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < rows; j++) {
		                if ((i == 0 || i == rows - 1) && j > 0 && j < rows - 1) {
		                    System.out.print("*");
		                } else if (j == 0 && i > 0 && i < rows - 1) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }

		        // Print 'A'
		        System.out.println();
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < rows; j++) {
		                if (j == rows / 2 || (i == j && j <= rows / 2) || (i == rows - j - 1 && j >= rows / 2)) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		        // Print 'I'
		        System.out.println();
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < rows; j++) {
		                if (j == rows / 2 || (i == 0 && j != rows / 2) || (i == rows - 1 && j != rows / 2)) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }

	public static void main(String[] args) {
		Pattern o=new Pattern();
		o.m3();
	}
}
