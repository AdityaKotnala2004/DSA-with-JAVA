public class CeilingOfaNumber {
    public static void main(String[] args) {
        int[] arr={-18,-10,-5,0,2,4,5,7,8,9,12,540};
        int target=13;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
  // for ceiling value min of greater nos from target if it doesn't exist will always be start at the end of processing
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return start;
    }
}
