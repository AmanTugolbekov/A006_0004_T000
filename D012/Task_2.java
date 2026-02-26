import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int maxVal = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int val = sc.nextInt();
                if (val > maxVal) {
                    maxVal = val;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println(maxRow + " " + maxCol);
    }
}
