import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print amount of integers: ");
        int amount = sc.nextInt();
        int[] arr = new int[amount];
        System.out.println("Type in the integers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int lowest = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
            }
            sum += arr[i];
        }
        double average = (double) (sum - lowest) / (arr.length - 1);
        System.out.println("The average is: ");
        System.out.printf("%.1f%n", average);
    }
}
