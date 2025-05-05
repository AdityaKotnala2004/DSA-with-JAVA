import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Fruits= in.next();

        /*     OLD FORMAT

        switch ( Fruits ){

            case "Mango" :
                System.out.println("It is King of fruits");
                break;

            case "Apple" :
                System.out.println("Red juicy fruit");
                break;

            case "Banana" :
                System.out.println("It is long tasty fruit");
                break;

            default :
                System.out.println("Enter valid fruit");
                break;
        }

         */

        switch (Fruits) {
            case "Mango" -> System.out.println("It is King of fruits");
            case "Apple" -> System.out.println("Red juicy fruit");
            case "Banana" -> System.out.println("It is long tasty fruit");
            default -> System.out.println("Enter valid fruit");
        }
    }
}