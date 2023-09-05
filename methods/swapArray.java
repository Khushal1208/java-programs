package methods;
import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));  //Arrays.toString(arr) is used to print all values in arr
        //using java.util.Array  class
    }

    private static void change(int[] num) {
        num[0]=90;    //here I have declared twice num[0] and num[1] but
        num[1]=60;     // the value declared last will survive or print
        num[0]=10;
        num[1]=15;
    }
}
