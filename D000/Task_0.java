import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int product = 1;

        for(int i = 0; num != 0; i++){
            product *= num % 10;
            num = num / 10;
        }
        System.out.println(product);
    }
}