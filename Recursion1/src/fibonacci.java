import java.util.*;
public class fibonacci {
	public static void fib(int a, int b, int n) {
		if(n==0) {
			return;
		}
		int c= a+b;
		System.out.println(c);
		fib(b, c, n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int n=5;
		fib(a, b, n-2);
	}

}
