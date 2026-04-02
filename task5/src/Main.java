import java.util.Arrays;

/// /библиотека lombok
/// /понять HashCode
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        Integer[] numbers = new Integer[]{0, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7};
//        ArrayList<Integer> nums = new ArrayList<>(List.of(numbers));
//        Map<Integer,Integer> freq = new HashMap<>();
//        nums.forEach(i-> freq.merge(i,1));
//    }
//}

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 0, 2, 1, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 0, 1, 2, 2};
        int left = 0;
        int right = arr.length - 1;
        int cur = 0;
        while (right > cur) {
            if (arr[cur] == 0) {
                int x = arr[cur];
                arr[cur] = arr[left];
                arr[left] = x;
                left++;
                cur++;
            } else if (arr[cur] == 2) {
                int x = arr[cur];
                arr[cur] = arr[right];
                arr[right] = x;
                right--;
            }else {
                cur++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
