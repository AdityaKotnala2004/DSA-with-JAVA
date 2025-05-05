import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ls= new ArrayList<>();
//        ls.add(1);
//        ls.add(1);
//        ls.add(1);
//        ls.add(1);
//        ls.add(1);
//        ls.add(1);

//        System.out.println(ls.contains(1));
//        System.out.println(ls);
//        ls.set(0,12);
//        ls.remove(3);
//        System.out.println(ls);

        for(int i=0;i<5;i++){
            ls.add(in.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.print(ls.get(i)+" ");
        }
    }
}
