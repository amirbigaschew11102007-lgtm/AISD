import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,2,4,3,2,8,9,11,12};
        int left = 0;
        int right = arr.length - 1;
        int cur = 0;
        while (right >= cur) {
            if (arr[cur]%2==0) {
                int x = arr[cur];
                arr[cur] = arr[left];
                arr[left] = x;
                left++;
                cur++;
            } else {
                cur++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}