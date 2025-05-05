import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
//        sum();
        int ans = sum2();
        System.out.println(ans);
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum is : " + sum);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;
    }
}