import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength =  sc.nextInt();

        int[] arr = new int[arrLength];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                double sqrt = Math.sqrt(arr[i]);
                int intSqrt = (int) sqrt;

                if(intSqrt * intSqrt == arr[i]){
                    count++;
                }
            }
        }

        System.out.println("Count of perfect square numbers: " + count);

    }
}
