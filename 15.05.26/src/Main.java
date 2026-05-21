import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] a;
    static boolean[][] used;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        task2();
    }

    public static void dfs(int x, int y) {
        used[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m
                    && !used[nx][ny] && a[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        a = new int[n][m];
        used = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int components = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1 && !used[i][j]) {
                    components++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(components);
    }

    public static void task2() {
        int[] numbers = new int[]{6, 1, 5, 3, 4, 2};
        int INF = 100;
        int[] minEnd = new int[numbers.length + 1];
        Arrays.fill(minEnd, INF);
        minEnd[0] = -INF;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length; j >= 1; j--) {
                if (minEnd[j - 1] < numbers[i] && numbers[i] <= minEnd[j]) {
                    minEnd[j] = numbers[i];
                }
            }
        }

        int len = 0;
        for (int j = numbers.length; j >= 1; j--) {
            if (minEnd[j] < INF) {
                len = j;
                break;
            }
        }

        System.out.println("Длина НВП = " + len);
    }

    public static void task1() {
    }
}