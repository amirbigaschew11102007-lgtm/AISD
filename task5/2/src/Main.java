import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Амир", "Артур", "Ишхан", "Настя", "Оля", "Ильвира", "Арина"};

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                for (int i = 0; i < arr.length; i++) {
                    if (a.charAt(i) != b.charAt(i)) {
                        return a.charAt(i) - b.charAt(i);
                    }
                }
                return 0;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}