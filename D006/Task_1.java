import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] profits = new int[n];
        for (int i = 0; i < n; i++) {
            profits[i] = sc.nextInt();
        }
        if (k > n) {
            System.out.println(0);
            return;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += profits[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum - profits[i-k] + profits[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }
}
