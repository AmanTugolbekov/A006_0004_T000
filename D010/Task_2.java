import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int evenLen = 1, oddLen = 1;
        if (arr[0] % 2 == 0) {
            evenLen = 1;
            oddLen = 0;
        } else {
            oddLen = 1;
            evenLen = 0;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenLen = Math.max(evenLen, oddLen + 1);
            } else {
                oddLen = Math.max(oddLen, evenLen + 1);
            }
        }
        System.out.println(Math.max(evenLen, oddLen));
    }
}
