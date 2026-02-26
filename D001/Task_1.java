import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int paid = sc.nextInt();
        if (paid < price) {
            System.out.println("NOT ENOUGH");
        } else {
            System.out.println(paid - price);
        }
    }
}
