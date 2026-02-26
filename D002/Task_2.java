import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean hasDigit = false;
        boolean hasUpper = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }
        if (password.length() >= 8 && hasDigit && hasUpper) {
            System.out.println("STRONG");
        } else {
            System.out.println("WEAK");
        }
    }
}
