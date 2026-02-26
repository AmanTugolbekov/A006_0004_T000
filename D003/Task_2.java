import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int balance = 0;
        boolean valid = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                balance++;
            } else if (s.charAt(i) == '}') {
                balance--;
                if (balance < 0) {
                    valid = false;
                    break;
                }
            }
        }
        if (valid && balance == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
