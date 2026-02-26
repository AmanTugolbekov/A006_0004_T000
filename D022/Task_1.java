import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int closest = scores[0];
        int minDiff = Math.abs(scores[0] - 50);
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(scores[i] - 50);
            if (diff < minDiff || (diff == minDiff && scores[i] < closest)) {
                minDiff = diff;
                closest = scores[i];
            }
        }
        System.out.println(closest);
    }
}
