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
            System.out.println("NONE");
            return;
        }
        int maxSoFar = arr[0];
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxSoFar) {
                System.out.println(arr[i]);
                found = true;
                break;
            }
            maxSoFar = Math.max(maxSoFar, arr[i]);
        }
        if (!found) {
            System.out.println("NONE");
        }
    }
}
