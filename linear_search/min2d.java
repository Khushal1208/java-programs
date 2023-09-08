package linear_search;
import java.util.*;

public class min2d {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 2, 3},
                {4, 5, 6, 65},
                {7, 8, 45, 32, 24, 9}
        };
        System.out.println("MINIMUM At index:" + min(arr));
        System.out.println("MAXIMUM At index:" + max(arr));

    }
    public  static int min(int [][] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
    public  static int max(int [][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    
}
