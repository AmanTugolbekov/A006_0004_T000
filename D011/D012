import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxBlock = 1;
        int currentBlock = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i-1]) {
                currentBlock++;
                maxBlock = Math.max(maxBlock, currentBlock);
            } else {
                currentBlock = 1;
            }
        }
        System.out.println(maxBlock);
    }
}
