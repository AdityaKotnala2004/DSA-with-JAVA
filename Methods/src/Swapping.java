import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
//        String name = "adi";
//        String ans = greet(name);
//        System.out.println(name);
//    }
//    // this shows that swapping in string cannot be achieved by function as it is passed by value
//    static String greet(String naam){
//        naam ="raj";
//        return naam;
//    }
        int[] arr={1,2,3,4,5};
        nums(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nums(int[] change){
         change[0]=99;
    }
}
// swapping in array works as it changes value by original number reference




