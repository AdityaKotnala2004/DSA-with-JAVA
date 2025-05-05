import java.util.Arrays;
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

//        for(int i=0;i<5;i++){             // take input from user for arr
//            arr[i]= in.nextInt();
//        }

//        for(int i=0;i<arr.length;i++){             // prints values through their indexes
//            System.out.print(arr[i]+" ");
//        }


//        for(int ak:arr){                  // prints values themselves through var (ak)
//            System.out.print(ak+" ");
//        }


//        System.out.println(Arrays.toString(arr));    // best inbuilt way to print arrays

        // array of objects
        String[] str= new String[4];

        for(int i=0;i< str.length;i++){
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="adi";
        System.out.println(Arrays.toString(str));
    }
}