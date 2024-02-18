
public class insertionSort {

	public insertionSort() {
		// TODO Auto-generated constructor stub
	}
	public static void printArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,4,6,10};
		
		for(int i=1; i<arr.length;i++) {
			//'i' is for iterating over unsorted part
			//'j' is for iterating over unsorted part
			int current = arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			//placement if current > arr[j]
			
			arr[j+1]=current;
			
		}
		printArray(arr);
	}

}
