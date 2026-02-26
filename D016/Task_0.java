import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char minDigit = '9';
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) < minDigit) {
                minDigit = n.charAt(i);
            }
        }
        System.out.println(minDigit);
    }
}
