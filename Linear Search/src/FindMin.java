public class FindMin {
    public static void main(String[] args) {
        int[] arr= {7,5,42,6,5,-9,2,4,1,6,8};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
