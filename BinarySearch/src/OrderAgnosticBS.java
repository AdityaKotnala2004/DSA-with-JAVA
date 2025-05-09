public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={-18,-10,-5,0,2,4,5,7,8,9,12,540};
        int[] arr={35,12,4,1,-45,-4};
        int target=12;
        int ans=OAbS(arr,target);
        System.out.println(ans);

    }

    static int OAbS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        Boolean asc= arr[start]<arr[end];

        while(start<=end){
            int mid= start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(asc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
            else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
