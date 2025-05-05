public class OverLoading {
    public static void main(String[] args) {
        fun(3);
        fun("adi");
    }
    static void fun(int a){
        System.out.println(a);
    }
    // func overloading takes place when 2 mehtods of same name, but diff parameter/argument type or number
    // it occurs at compile time
    static void fun(String name){
        System.out.println(name);
    }
}
