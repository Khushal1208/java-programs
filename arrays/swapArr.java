package arrays;
import java.util.*;
public class swapArr{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println("before swaping:"+Arrays.toString(arr));
        swap(arr,1,4);
        System.out.println("after swaping:"+Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i1, int i2) {
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }

}
