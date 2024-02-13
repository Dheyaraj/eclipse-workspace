import java.util.Scanner;
//Kadane's Algorithm
public class MaxSubArray {
	public static int maxSubArraySum(int[] arr) {
		int n= arr.length;
		int maxSum= Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			int currSum=0;
			for(int j=i; j<n; j++) {
				currSum+=arr[j];
				
				if(currSum>maxSum) {
					maxSum=currSum;
				}
			}
		}
		return maxSum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,-3,4};
		System.out.println(maxSubArraySum(arr));
		
	}

}
