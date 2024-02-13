
public class evenOddCount {
	public static void countOddEven(int[] arr)
    {
        int even=0, odd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
               even++; 
            }else{
                odd++;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		countOddEven(arr);
	}
}
