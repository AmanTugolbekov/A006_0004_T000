import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        int pairs = 0;
        for (int num : arr) {
            int complement = S - num;
            if (freq.containsKey(complement)) {
                pairs += freq.get(complement);
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(pairs);
    }
}
