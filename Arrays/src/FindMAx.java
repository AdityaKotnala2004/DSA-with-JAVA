public class FindMAx {
    public static void main(String[] args) {
        int[] arr = {1,5,8,4};
        int temp=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                System.out.println(-1);
            }
            if (arr[i]>temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
