package linear_search;
import java.util.*;

public class searchIN2Darray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6,65},
                {7,8,45,32,24,9}
        };
        int target = 24;
        System.out.println("At index:"+ Arrays.toString(search(arr,target)));
    }

    //here  public static int search(int []arr,int target)    will not work .
    public static int[] search(int [][]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0 ; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};        // make new obj and return that arr[i][j]
//                    return true;
                }
            }
        }
        return new int[]{-1,-1};
//        return false;
    }
}
