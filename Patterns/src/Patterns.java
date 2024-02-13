import java.util.*;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		/*
		for(int i=1; i<=4;i++) {
			for(int j=1; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/*
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i=4; i>=1; i-- ) {
			
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
		
		/*
		for(int i=4; i>=1 ; i++) {
			
			for(int j=4; j>=i; j--) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		*/
		
		/*
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		int n=5;
		int number=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(number);
				number--;
			}
			System.out.println();
		}
		*/
		
		/*
		for (int i=1; i<=3; i++) {
			for(int j=1; j<=6; j++) {
				if(i==3||(i==2 & j==1)||(i==2 & j==2)||(i==2 & j==5)||(i==2 & j==6)||(i==1 & j==1)||(i==1 & j==6)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		*/
}
}