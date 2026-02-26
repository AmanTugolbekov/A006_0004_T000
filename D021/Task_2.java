import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder(str);
            String candidate = sb.deleteCharAt(i).toString();
            
            if (isPalindrome(candidate)) {
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
    }
    
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
