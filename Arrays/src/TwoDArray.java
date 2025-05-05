import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int[][] arr1= {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
        int[][] arr= new int[3][3];

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }

        // output method #1

//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println(" ");
//        }

        //output method #2

//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // output method #3

        for(int[] ar: arr){
            System.out.println(Arrays.toString(ar));
        }
    }
}




