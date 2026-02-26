import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char maxDigit = '0';
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) > maxDigit) {
                maxDigit = n.charAt(i);
            }
        }
        System.out.println(maxDigit);
    }
}
