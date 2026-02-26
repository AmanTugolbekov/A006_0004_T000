import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int current = 0;
        for (int i = 0; i < n; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            current -= out;
            if (current < 0) current = 0;
            current += in;
            if (current > c) {
                System.out.println("OVERFLOW");
                return;
            }
        }
        System.out.println("OK");
    }
}
