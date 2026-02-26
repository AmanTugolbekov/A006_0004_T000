import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int turns = 0;
        for (int i = 1; i < n-1; i++) {
            if ((arr[i] > arr[i-1] && arr[i] > arr[i+1]) || 
                (arr[i] < arr[i-1] && arr[i] < arr[i+1])) {
                turns++;
            }
        }
        System.out.println(turns);
    }
}
