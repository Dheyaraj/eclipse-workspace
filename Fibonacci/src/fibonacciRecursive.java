public class fibonacciRecursive {
    public static void main(String[] args) {
    	long start = System.currentTimeMillis();
        int n = 15;
        long[] fibonacciArray = new long[n];

        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacciOf(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciArray[i] + " ");
        }
        long end =System.currentTimeMillis();
        double total = (end - start) / 1000.0;
        System.out.println(total);
    }

    public static long fibonacciOf(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacciOf(n - 1) + fibonacciOf(n - 2);
        }
    }
}





