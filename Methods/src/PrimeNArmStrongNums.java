import java.util.Scanner;

public class PrimeNArmStrongNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(check(n));
//        System.out.println(isArm(n));
        for(int i=100;i<1000;i++){     // to tell all 3 digit armstrong
            if ( isArm(i) ){
                System.out.print(i+" ");
            }
        }
    }

    static Boolean isArm(int n){
        int og=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum= sum+ rem*rem*rem;
        }
        return og==sum;
    }
    static Boolean check(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
