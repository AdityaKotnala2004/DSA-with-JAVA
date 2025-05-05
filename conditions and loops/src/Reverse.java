import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int ans=0;

        while(n>0){
            int temp=n%10;
            n/=10;

            ans= ans *10 + temp;
        }
        System.out.println(ans);
    }
}
