import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int totalMinutes = h * 60 + m + d;
        int newH = (totalMinutes / 60) % 24;
        int newM = totalMinutes % 60;
        System.out.println(newH + " " + newM);
    }
}
