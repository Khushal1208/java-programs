package arrays;
import java.util.*;
public class maximumValue {
    public static void main(String[] args) {
        int [] arr = {100,65,300,4,555,87};
        System.out.println(max(arr));
    }
    public static int max(int [] arr){
        int maxval = arr[0];
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
            //edge case
             if(arr.length==0){
                return -1;
            }

        }
        return maxval;
    }
}
