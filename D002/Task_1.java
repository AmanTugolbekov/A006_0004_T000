import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.nextLine();
        int position = 0;
        for (int i = 0; i < commands.length(); i++) {
            if (commands.charAt(i) == 'L') {
                position--;
            } else if (commands.charAt(i) == 'R') {
                position++;
            }
        }
        System.out.println(position);
    }
}
