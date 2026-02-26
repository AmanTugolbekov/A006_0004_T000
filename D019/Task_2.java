import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < n) merged[k++] = arr1[i++];
        while (j < m) merged[k++] = arr2[j++];
        int total = n + m;
        if (total % 2 == 1) {
            System.out.println(merged[total/2]);
        } else {
            double median = (merged[total/2 - 1] + merged[total/2]) / 2.0;
            if (median == (int)median) {
                System.out.println((int)median);
            } else {
                System.out.println(median);
            }
        }
    }
}
