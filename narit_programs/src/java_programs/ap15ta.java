package java_programs;

public class ap15ta {

	void m(int i) {

		int j=i+11;
		int k=j+21;
		int l=k+42;
		int m=l+84;
		int n=m+168;

		if(i>=5) {
			System.out.println("if Block Executed and i value is:"+i);
			if(j<=15) {

			}
			else {
				System.out.println("else Block Executed and j value is:"+j);
				switch(k) {
				case 21:
					
				case 42:{
					System.out.println("switch Executed and k value is:"+m);
					while(l!=k) {
						System.out.println("while Executed and l value is:"+l);
						do {
							for(int o=334;o<n;o++) {
								System.out.println("for Executed and o value is:"+o);
							}
							System.out.println("do while Executed and m value is:"+m);
						}
						while(m==84);
						k*=2;
					}
					break;
				}
				case 63:
					
				case 84:

				}
			}
		}
	}
	public static void main(String[] args) {
		new ap15ta().m(10);
	}
}
