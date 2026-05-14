import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        nails(new int[]{1, 3, 13, 132, 233, 4, 21, 11});
    }

    public static boolean fibanachi(long numb) {
        if (numb <= 0) {
            return false;
        }
        ArrayList<Long> numbers = new ArrayList<>();
        numbers.add(1L);
        numbers.add(2L);
        while (true) {
            long next = numbers.get(numbers.size() - 2) + numbers.get(numbers.size() - 1);
            if (next > numb) break;
            numbers.add(next);
            System.out.println(next);
        }
        System.out.println(numbers.size());
        if (numbers.getLast() == numb) {
            return true;
        }
        return false;
    }

    public static long numbFibonachy(long numb) {
        if (numb <= 0) {
            throw new IllegalArgumentException();
        }
        ArrayList<Long> numbers = new ArrayList<>();
        numbers.add(1L);
        numbers.add(2L);
        int ind = 3;
        while (ind < numb) {
            long next = numbers.get(numbers.size() - 2) + numbers.get(numbers.size() - 1);
            numbers.add(next);
            ind++;
            if (ind == numb) {
                System.out.println(next);
                return next % 10;
            }
        }
        return 0;
    }

    public static String bot(String lineChars) {
        ArrayList<Long> numbers = new ArrayList<>();
        numbers.add(0L);
        numbers.add(1L);
        numbers.add(2L);
        while (true) {
            long next = numbers.get(numbers.size() - 2) + numbers.get(numbers.size() - 1);
            numbers.add(next);
            if (numbers.size() == lineChars.length()) {
                break;
            }
        }
        String sum = "";
        for (long i = 0; i < lineChars.length(); i++) {
            if (numbers.contains(i)) {
                sum += (char) lineChars.charAt((int) i);
            }
        }
        return sum;
    }

    public static int newBot4(int N,int M){
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int[] dp = new int[M];

        dp[0] = grid[0][0];
        for (int j = 1; j < M; j++) {
            dp[j] = dp[j-1] + grid[0][j];
        }

        for (int i = 1; i < N; i++) {
            dp[0] = dp[0] + grid[i][0];

            for (int j = 1; j < M; j++) {
                dp[j] = Math.min(dp[j], dp[j-1]) + grid[i][j];
            }
        }
        return dp[M-1];
    }

    public static void nails(int[] a){
        Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < a.length-2; i += 2) {
            sum += Math.abs(a[i + 1] - a[i]);//ну типо если по координатам будет -1 или типо того
        }
        System.out.println(sum);
    }
}