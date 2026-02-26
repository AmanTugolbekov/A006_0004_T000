import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int prev = s.charAt(i-1) - '0';
            int curr = s.charAt(i) - '0';
            if (prev % 2 == 1 && curr % 2 == 1) {
                result.append('*');
            }
            result.append(s.charAt(i));
        }
        System.out.println(result.toString());
    }
}
