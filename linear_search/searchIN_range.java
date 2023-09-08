package linear_search;

import java.util.Scanner;
import  java.util.*;
public class searchIN_range {
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
        System.out.println("enter your range");
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println("at index ="+search(arr,start ,end ,target));
    }
// search in range
    public static int search(int[] arr,int start , int end ,int target) {
        for (int i =start; i < end; i++) {
            if (arr[i] == target) {
                return i; // Found the target, return its index
            }
        }

        return -1; // Target not found in the array
    }
}

