import java.util.*;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int [] arr) {
		boolean x =false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
				x=true;
				System.out.println(arr[i]+" is duplicated");
				break;
			}
		}
			
		}	
		return x; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4};
		System.out.println(containsDuplicate(nums));
	}

}
