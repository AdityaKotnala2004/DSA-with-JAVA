public class BinarySearchEx{
    public static void main(String[] args) {
        int[] arr={-18,-10,-5,0,2,4,5,7,8,9,12,540};
        int target=12;
        int ans=bs(arr,target);
        System.out.println(ans);
    }

    static int bs(int[] arr,int target){
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
        return-1;
    }
}