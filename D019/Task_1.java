import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int battery = 100;
        for (int i = 0; i < n; i++) {
            int change = sc.nextInt();
            battery += change;
            if (battery < 0 || battery > 100) {
                System.out.println("INVALID");
                return;
            }
        }
        System.out.println(battery);
    }
}
