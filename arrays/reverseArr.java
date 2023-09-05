package arrays;
import java.util.*;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
        System.out.println("Before reverse: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reverse: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
