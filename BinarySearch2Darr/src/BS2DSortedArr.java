import java.util.Arrays;

public class BS2DSortedArr {
    public static void main(String[] args) {
        int[][] matrix= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,6)));
    }

    // search in provided rows between provided columns
    static int[] bs(int[][] arr, int row, int cStart , int cEnd , int target ){
        while( cStart<=cEnd){
            int mid= cStart +(cEnd-cStart)/2;
            if(target == arr[row][mid]){
                return new int[]{row,mid};
            }
            if(target > arr[row][mid]){

                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr,int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (cols == 0){
            return new int[] {-1,-1};
        }

        if (rows == 1) {
            return bs(arr, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // running loop till 2 rows remaining
        while(rStart<rEnd-1){
            int mid= rStart + (rEnd-rStart)/2;
            if(arr[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid] > target){
                rEnd= mid;
            }
            else {
                rStart=mid;
            }
        }

        // now we have 2 rows
        if(arr[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        // search in 1st half
        if (target <= arr[rStart][cMid-1]){
            return bs(arr,rStart,0,cMid-1,target);
        }
        // search in 2nd half
        if (target >= arr[rStart][cMid+1] && target<= arr[rStart][cols-1]){
            return bs(arr,rStart,cMid+1,cols-1,target);
        }
        // search in 3rd half
        if (target <= arr[rStart+1][cMid-1]){
            return bs(arr,rStart+1,0,cMid-1,target);
        }
        // search in 4th half
        else {
            return bs(arr,rStart+1,cMid+1,cols-1,target);
        }
    }
}
