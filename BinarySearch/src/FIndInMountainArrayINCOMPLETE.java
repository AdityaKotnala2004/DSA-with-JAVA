public class FIndInMountainArrayINCOMPLETE {
    int search(int[] arr, int target){
        int peak= findPeakElement(arr);
        int try1= OAbS(arr,target,0,peak);
        if(try1!=-1){
            return try1;
        }
        return OAbS(arr,target,peak+1,arr.length-1);
    }

    int findPeakElement(int[] nums) {
        int start=0;
        int end = nums.length-1;
        while(start<end){
            int mid=start+ (end-start)/2;
            if(nums[mid]>nums[mid+1]){  // mid in des part of array
                end=mid;
            }
            else {    // mid in asc part
                start=mid+1;
            }
        }
        return start;
    }

    int OAbS(int[] arr, int target, int start, int end){
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
// leetcode ques 1095
