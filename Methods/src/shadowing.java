public class shadowing {
    static int x = 90;  // this will be shadowed in line 6

    public static void main(String[] args) {
        System.out.println(x); //90
        int x=40;
        System.out.println(x); //40
        num();  //90
    }
    static void num(){
        System.out.println(x); // shadowing doesn't work here as it's out of scope
    }
}
