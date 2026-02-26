import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        char[][] maze = new char[r][c];
        int startR = -1, startC = -1;
        int endR = -1, endC = -1;
        for (int i = 0; i < r; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < c; j++) {
                maze[i][j] = line.charAt(j);
                if (maze[i][j] == 'S') {
                    startR = i;
                    startC = j;
                } else if (maze[i][j] == 'E') {
                    endR = i;
                    endC = j;
                }
            }
        }
        boolean[][] visited = new boolean[r][c];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startR, startC});
        visited[startR][startC] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[0] == endR && current[1] == endC) {
                System.out.println("YES");
                return;
            }
            for (int i = 0; i < 4; i++) {
                int nr = current[0] + dr[i];
                int nc = current[1] + dc[i];
                if (nr >= 0 && nr < r && nc >= 0 && nc < c && 
                    !visited[nr][nc] && maze[nr][nc] != '#') {
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr, nc});
                }
            }
        }
        System.out.println("NO");
    }
}
