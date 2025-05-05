import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = in.nextInt();
        int count=0;

        while(n>0){
           int temp=n%10;
            if(temp==i){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
