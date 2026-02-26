import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int bestStart = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= start) {
                start = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, end);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                bestStart = start;
            }
        }
        System.out.println(s.substring(bestStart, bestStart + maxLength));
    }
}
