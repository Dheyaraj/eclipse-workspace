package loops;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //print n natural numbers
       /* 
         for(int counter=0; counter<n; counter=counter+1) {
        	System.out.println(counter+1);
        }
        */
        
        for (int i=1; i<=20; i++) {
        	System.out.print(n);System.out.print("X");System.out.print(i);System.out.print("=");System.out.println(n*i);
        	
        }
	}

}
