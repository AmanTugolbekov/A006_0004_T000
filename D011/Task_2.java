import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int smallest = 1;
        for (int i = 0; i < n && arr[i] <= smallest; i++) {
            smallest += arr[i];
        }
        System.out.println(smallest);
    }
}
