import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int ans = sum2(n1,n2);
        System.out.println(ans);
    }
    static int sum2(int a, int b){
        return a+b;
    }
}
