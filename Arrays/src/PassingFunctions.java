import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] arr= {1,3,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[1]=34;
    }
}
