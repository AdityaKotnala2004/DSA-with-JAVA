import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;

        while(true){
            System.out.print("Enter the operator: ");
            char o = in.next().trim().charAt(0);

            if( o == '+' || o == '-' || o == '*' || o == '/' || o == '%'){

                System.out.print("Enter the numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();

                if(o == '+'){
                    System.out.println(a+b);
                }
                if(o == '-'){
                    System.out.println(a-b);
                }
                if(o == '*'){
                    System.out.println(a*b);
                }
                if(o == '/'){
                    if(b == 0){
                        System.out.println("NOT DEFINED   NIGGA!!");
                    }
                    else{
                        System.out.println(a/b);
                    }
                }

            }
            else if(o == 'x' || o == 'X'){
               break;
            }
            else {
                System.out.println("GIVE AN OPERATOR    NIGGA!!");
            }
        }
    }
}
