public class LS_inString {
    public static void main(String[] args) {
        String str= "Aditya";
        char target='t';
        System.out.println(check(str,target));
    }

    static Boolean check(String a,char i){
        for (int j = 0; j <a.length() ; j++) {
            if (i==a.charAt(j)){
                return true;
            }
        }
        return false;
    }

}
