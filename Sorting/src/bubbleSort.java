import java.util.*;
public class bubbleSort {
	// time complexity= O(n^2)
	public static void printArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,5,2,0};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
				//swap
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
			}
		}
	}
  printArray(arr);
}
}