package arrays;
import java.util.*;
public class printTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];    //input rows and columns

        for(int row = 0;row<arr.length;row++){
            // for each col. in every row
            for(int col = 0;col<arr[row].length;col++){          //input elements
                arr[row][col] = sc.nextInt();
            }
        }
//        for(int row = 0;row<arr.length;row++){
//            // for each col. in every row
//            for(int col = 0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");          //print elements
//            }
//            System.out.println();                            //print space after printing one line
//        }

//        using for each loop or Enhanced loop
        for (int[] a : arr) {
                System.out.println(Arrays.toString(a));          //print elements
            }





    }
}
