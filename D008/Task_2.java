import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directions = sc.nextLine();
        int x = 0, y = 0;
        for (int i = 0; i < directions.length(); i++) {
            char c = directions.charAt(i);
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;
        }
        System.out.println(x + " " + y);
    }
}
