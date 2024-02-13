import java.util.*;
public class Factorial {
	public static int calcFactorial(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		int fact_nm1=calcFactorial(n-1);
		int fact = n * fact_nm1;
		//System.out.println(fact);
		return fact;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = calcFactorial(6);
		System.out.println(n);
	}

}
