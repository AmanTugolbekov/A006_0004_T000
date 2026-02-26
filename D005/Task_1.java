import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0;
        int result = arr[0];
        for (int num : arr) {
            if (freq.get(num) > maxFreq) {
                maxFreq = freq.get(num);
                result = num;
            }
        }
        System.out.println(result);
    }
}
