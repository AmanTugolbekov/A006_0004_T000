import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.' || c == ',' || c == '!' || c == '?' || c == ':' || c == ';') {
                count++;
            }
        }
        System.out.println(count);
    }
}
