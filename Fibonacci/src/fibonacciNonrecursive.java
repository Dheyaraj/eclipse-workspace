import java.util.Scanner;
public class fibonacciNonrecursive {

		public static void main(String[] args)
		{
			  long start=System.currentTimeMillis();
			  int i = 1, t1 = 0, t2 = 1;
			  Scanner input = new Scanner(System.in);
			  System.out.println("Enter the number to limit Fibonacci series: ");
			  int num = input.nextInt();
			  System.out.println("First " + num + " terms: ");
			  
			  while (i <= num) {
			   System.out.print(t1 + " ");
			   int sum = t1 + t2;
			   t1 = t2;
			   t2 = sum;
			   i++;
			  }	
			  input.close();
			  System.out.println(" ");
			  long end =System.currentTimeMillis();
			  double total= (end- start) /1000.0;
			  System.out.println("Time taken:"+total+" ");
		}
	
			
}
