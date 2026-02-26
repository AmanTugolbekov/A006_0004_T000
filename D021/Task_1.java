import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
            min = Math.min(min, scores[i]);
        }
        double average = (double)(sum - min) / (n - 1);
        System.out.println(average);
    }
}
