import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		int marks[]= {1,2,3,4,5};
		int x = sc.nextInt();
		for(int i=0; i<6; i++) {
			if(marks[i]==x) {
				System.out.println(i);
			}
			
		}
		*/
		
		/*
		//Take an array of names as input from the user and print them on the screen.
		int no_students = sc.nextInt();
		String names[]= new String [no_students];
		
		for(int i=0; i<no_students; i++) {
			names[i]=sc.next();
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] );
		}
		*/
		
		 int size = sc.nextInt();
	      int numbers[] = new int[size];


	      //input
	      for(int i=0; i<size; i++) {
	          numbers[i] = sc.nextInt();
	      }


	      int max = Integer.MIN_VALUE;
	      int min = Integer.MAX_VALUE;
	     
	       for(int i=0; i<numbers.length; i++) {
	           if(numbers[i] < min) {
	               min = numbers[i];
	           }
	           if(numbers[i] > max) {
	               max = numbers[i];
	           }
	       }


	       System.out.println("Largest number is : " + max);
	       System.out.println("Smallest number is : " + min);
		
	}

}
