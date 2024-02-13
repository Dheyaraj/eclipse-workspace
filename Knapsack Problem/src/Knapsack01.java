import java.util.ArrayList;
import java.util.List;

public class Knapsack01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] val = {3, 4, 5, 6};
        int[] wt = {2, 3, 4, 5};
        int W = 5;
        int n = val.length;
        int[][] K = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    K[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                } else {
                    K[i][w] = K[i - 1][w];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.println();
            for (int w = 0; w <= W; w++) {
                System.out.print(K[i][w] + " ");
            }
            System.out.println();
        }

        int res = K[n][W];
        int w = W;
        List<Integer> set = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if (res <= 0) {
                break;
            }
            if (res == K[i - 1][w]) {
                continue;
            } else {
                set.add(wt[i - 1]);
            }
            res -= val[i - 1];
            w -= wt[i - 1];
        }

        System.out.println("max profit is " + K[n][W]);
        System.out.print("set of the combination for max profit is: ");
        for (int i = 0; i < set.size(); i++) {
            System.out.print(set.get(i) + " ");
        }

        long end = System.currentTimeMillis();
        double total = (end - start) / 1000.0;
        System.out.println("\nExecution time: " + total + " seconds");
    }
}