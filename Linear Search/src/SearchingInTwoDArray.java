import java.util.Arrays;

public class SearchingInTwoDArray {
    public static void main(String[] args) {
        int[][] arr={
                {12,15,9},
                {4,56,98,45},
                {12},
                {98,25},
        };
        int target=45;
        int[] ans=find(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
