import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] temps = new int[n];
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }
        int maxStreak = 1;
        int currentStreak = 1;
        for (int i = 1; i < n; i++) {
            if (temps[i] > temps[i-1]) {
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            } else {
                currentStreak = 1;
            }
        }
        System.out.println(maxStreak);
    }
}
