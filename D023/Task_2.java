import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n < 3) {
            System.out.println("NO");
            return;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
