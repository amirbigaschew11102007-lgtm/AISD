//import java.util.Arrays;
//
//public class Main{
//    public static void main(String[] args){
//        int[] arr =new int[]{3,30,34,5,9};
//        String result="";
//        int max=0;
//        for (int i=0;i< arr.length-1;i++){
//            if(length(arr[i])>length(arr[i+1])){
//
//            }
//        }
//    }
//    public static int length(int i){
//        while (i>10){
//            i/=10;
//        }return i;
//    }
//}

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};

        String[] arrStr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrStr[i] = String.valueOf(arr[i]);
        }

        for (int i = 0; i < arrStr.length - 1; i++) {
            for (int j = i + 1; j < arrStr.length; j++) {
                if ((arrStr[j] + arrStr[i]).compareTo(arrStr[i] + arrStr[j]) > 0) {
                    String temp = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = temp;
                }
            }
        }

        String result = "";
        for (String s : arrStr) {
            result+=s;
        }
        System.out.println(result); // 9534330
    }
}