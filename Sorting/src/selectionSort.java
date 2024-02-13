import java.util.*;

public class selectionSort {
	
	public static void printArray(int array[]) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int arr[] = {3,1,5,2,9};
		
		for(int i=0; i<arr.length; i++) {
			int smallest=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[smallest] > arr[j]) {
					smallest=j;
				}
			}
			int temp = arr[smallest];
			arr[smallest]= arr[i];
			arr[i]=temp;
		}
		printArray(arr);
	}

}
