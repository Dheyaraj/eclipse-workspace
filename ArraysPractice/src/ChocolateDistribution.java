import java.util.Arrays
;
public class ChocolateDistribution {
	
	static int findMinDiff(int arr[], int n, int m){
		if (m==0 || n==0) {
			return 0;
		}
		
		Arrays.sort(arr);
		
		if(m>n) {
			return -1;
		}
		
		int min_diff= Integer.MAX_VALUE;
		
		for(int i=0; i+m-1<n; i++) {
			int diff=arr[i+m-1] - arr[i];
			if(diff<min_diff) {
				min_diff=diff;
			}
		}
		return min_diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,6,8,2,1};
		int m=4;
		int n= arr.length;
		System.out.println(findMinDiff(arr,n,m));
	}

}
