import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();


        // initializing size of ArrayList
        for(int i=0;i<3;i++){
            ls.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ls.get(i).add(in.nextInt());
            }
        }
        System.out.println(ls);
    }
}
