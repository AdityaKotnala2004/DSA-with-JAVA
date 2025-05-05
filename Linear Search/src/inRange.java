public class inRange {
    public static void main(String[] args) {
        int[] nums= {1,15,85,95,45,21,35,69};
        int target=95;
        int ans=linearSearch(nums,target,1,5);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if (arr.length == 0 ){
            return -1;
        }
        for (int i = start; i < end; i++) {
            if(target==arr[i]){
                return i;   // to return value instead of index return target
            }
        }
        return -1;
    }
}
