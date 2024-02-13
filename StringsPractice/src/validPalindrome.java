import java.util.Scanner;
public class validPalindrome {
	public static boolean isPalindrome(String s) {
		String s1="";
		for(int i=s.length()-1; i>=0; i--) {
			s1+=s.charAt(i);
		}
		if(s1.compareTo(s)==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		isPalindrome(s);
		s.repla
	}

}
