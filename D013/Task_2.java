import java.util.Scanner;

public class Main {
    public static boolean canSplit(int[] pages, int k, int maxPages) {
        int groups = 1;
        int currentSum = 0;
        for (int page : pages) {
            if (currentSum + page > maxPages) {
                groups++;
                currentSum = page;
                if (groups > k) return false;
            } else {
                currentSum += page;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] pages = new int[n];
        int sum = 0;
        int maxPage = 0;
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
            sum += pages[i];
            maxPage = Math.max(maxPage, pages[i]);
        }
        int left = maxPage;
        int right = sum;
        int result = sum;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canSplit(pages, k, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(result);
    }
}
