import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        switch (n){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        switch (n){
            case 1,2,3,4,5 -> System.out.println("WeekDay");
            case 6,7 -> System.out.println("WeekEnd");
        }
    }
}
