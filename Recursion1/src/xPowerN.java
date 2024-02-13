
public class xPowerN {
	public static int calc(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(x==0 && n==0) {
			return 0;
		}
		int xPownm1= calc(x, n-1);
		int xPown= x * xPownm1;
		return xPown;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2, n=5;
		int ans = calc(x, n);
		System.out.println(ans);
	}

}
