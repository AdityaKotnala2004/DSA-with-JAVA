import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ## automatic type casting , happens in case of bigger value cnvrting into smaller ##

//        float num= input.nextFloat();
//        System.out.println(num);

        // ## explicit type casting ##

//        int num= (int) 54.14f;
//        System.out.println(num);

        // ## automatic type promotion in expressions ##

//          int a=257;
//          byte b= (byte) a;      // 257%256 = b ;    as 256 is the max size of byte
//          System.out.println(b);

        // ## arithmetic in type casting ##

//          byte a= 40;
//          byte b= 50;
//          byte c= 60;
//          int d= a*b/c;
//          System.out.println(d);

        // ## automatic type casting into ascii values ##

//          int num = 'A';
//          System.out.println(num);     // A ascii is 65

        // ## all in one example ##

          byte b= 40;
          char c='d';
          short s=1034;
          int i=45000;
          float f=34.24f;
          double d=21.54875;
          double result = (f*b) + (i/c) + (d*s);
          // float + int + double
          System.out.println((f*b) + " " + (i/c) + " " + (d*s));
          System.out.println(result);
    }
}
