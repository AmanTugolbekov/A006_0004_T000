import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] present = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 0 && num <= n) {
                present[num] = true;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (!present[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}
