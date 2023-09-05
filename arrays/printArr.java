package arrays;
import java.util.*;
public class printArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for(int i = 0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println(Arrays.toString(arr));

    }
}
