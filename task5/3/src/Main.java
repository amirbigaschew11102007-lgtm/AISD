public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4};
        int n=6;
        int right= arr.length-1;
        int left=0;
        while (left<=right){
            if (arr[left]+arr[right]==n){
                System.out.println(arr[left]+" "+arr[right]);
                break;
            } else if(arr[left]+arr[right]<=n){
                left++;
            }else if(arr[left]+arr[right]>=n){
                right--;
            }
        }
    }
}
