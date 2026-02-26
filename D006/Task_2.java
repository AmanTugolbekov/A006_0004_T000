import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pos1 = sc.nextLine();
        String pos2 = sc.nextLine();
        if (pos1.equals(pos2)) {
            System.out.println(0);
        } else if (pos1.charAt(0) == pos2.charAt(0) || pos1.charAt(1) == pos2.charAt(1)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
