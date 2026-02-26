import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the first integer: ");
        int a = sc.nextInt();
        System.out.println("Type in the second integer: ");
        int b = sc.nextInt();
        if(a % b == 0){
            System.out.println("Divisible: Yes");
        }else {
            System.out.println("Divisible: No");
        }
    }
}
