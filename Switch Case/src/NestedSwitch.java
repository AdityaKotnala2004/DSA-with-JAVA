import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dept = in.next();

        switch (empId) {
            case 1 -> System.out.println("Aditya kotnala");
            case 2 -> System.out.println("Alzeb");
            case 3 -> {
                System.out.println("Pranay");
                switch (dept) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("Management department");
                    default -> System.out.println("Enter valid department");
                }
            }
            default -> System.out.println("Enter valid employee Id");
        }
    }
}
