package Patterns;

public class Star_Patterns {

	void m1() {
		int i,j,row=5,col=5;

		//1.Square star pattern
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//2.Hollow Square Star Pattern
		for(i=1;i<=row;i++) {
			for(j=1;j<=col;j++) {
				if (i==1||i==row||j==1||j==col) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------		

		//3.Rhombus Star Pattern
		for(i=1;i<=row;i++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//4.Mirrored Rhombus Star Pattern
		for(i=1;i<=row;i++) {
			for(j=row-i;j>0;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//5.Right Triangle Star Pattern
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//6.Left Triangle Star Pattern
		for(i=0;i<row;i++) {
			for(j=(row)-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//7.Pyramid Star Pattern
		for(i=0;i<row;i++) {
			for (j=row-i; j>1; j--)
			{
				// printing spaces
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//8.Hollow Pyramid Star Pattern
		for(i=1;i<=row;i++) {
			for(j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				if(i==1||i==row||j==1||j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//9.Inverted Pyramid star pattern
		for(i=0;i<row;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(j=row-i;j>0;j--) {
				System.out.print(" #");
			}
			System.out.println();
		}
		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//10.Inverted hallow Pyramid star pattern
		for( i=row;i>0;i--)
		{
			for( j=1;j<=row-i;j++)
				System.out.print(" ");
			if(i==1 || i==row)
				for(j=1;j<=i*2-1;j++)
					System.out.print("*");
			else
				for( j=1;j<=i*2-1;j++)
					if(j==1 || j==i*2-1)
						System.out.print("*");
					else
						System.out.print(" ");
			System.out.println();}

		System.out.println("-------------");

		//----------------------------------------------------------------------------------------------

		//11.Diamond Shape Pattern 
		int space=row-1;
		for(i=0;i<row;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		for(i=1;i<=row-1;i++) {
			for(j=2;j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(j=1;j<=2*(row-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");


		//----------------------------------------------------------------------------------------------

		//12. Half Diamond Star Pattern
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=row-1;i>0;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}


	public static void main(String[] args) {
		Star_Patterns o=new Star_Patterns();
		o.m1();}
}
