import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4};
        int n = 6;
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(map);

        for (int num : arr) {
            int complement = n - num;
            if (map.containsValue(complement)) {
                System.out.println(map.get(complement) + " " + num);
                return;
            }
            map.put(num,num);

            System.out.println(map);
            // чисто показать как изменяется map
        }
        System.out.println("Пару не нашли");

    }
}


//        while (left<=right){
//            if (arr[left]+arr[right]==n){
//                System.out.println(arr[left]+" "+arr[right]);
//                break;
//            } else if(arr[left]+arr[right]<=n){
//                left++;
//            }else if(arr[left]+arr[right]>=n){
//                right--;
//            }
//        }