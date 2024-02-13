import java.util.Scanner;
public class ReverseAnArray {
	
	public static void reverseArray(int arr[], int start, int end) {
		int temp=0;
		 while(start<end) {
			 temp= arr[start];
			 arr[start]= arr[end];
			 arr[end]= temp;
			 start++;
			 end--;
		 }
	}
	
	public static void printArray(int arr[],int size) {
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Taking an Array's Input from user
		int size=sc.nextInt();
		int [] arr= new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}

		printArray(arr, size);
		reverseArray(arr, 0, size-1);
		System.out.println("Reversed Array is\n");
		printArray(arr, size);
		
	}

}
