import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
        funk(1,3,"okay","haha");

    }

    static void funk(int a, int b, String ...u){
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(Arrays.toString(u));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
