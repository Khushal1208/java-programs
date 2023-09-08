package linear_search;

import java.util.*;

public class takeInput_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of arr:");
        int n = in.nextInt();
        int [] arr = new int[n];
       for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.print(" Enter target:");
       int target = in.nextInt();
        System.out.print("Found at Index:"+search(arr,target));
    }
    public static int search(int []arr,int target){
        for(int i=0;i<arr.length;i++){      //using for each loop ,it will not work
            if (arr[i] == target) {
                return i; // Found the target, return its index
            }
        }
        return -1; // Target not found in the array
    }
}
