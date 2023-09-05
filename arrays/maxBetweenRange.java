package arrays;
import java.util.*;
public class maxBetweenRange {
    public static void main(String[] args) {
        int[] arr={5,9,6,78,21,45,69,44,77,82};
        System.out.println(maxRange(arr,5,6));
    }
    public static int maxRange(int [] arr,int start,int end){
        int maxval=arr[start];
        int minval=arr[end];
        for(int i=start;i<end;i++){
            if(maxval<arr[i]){
                maxval=arr[i];
            }
////            edge cases
//           else if(end<start){
//                return -1;
//            }
            else if(arr==null){
                return -1;
            }
        }
        return maxval;
    }
}
