package linear_search;
import java.util.*;
// https://leetcode.com/problems/richest-customer-wealth/
public class wealthyPerson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][]arr=new int[in.nextInt()][in.nextInt()];
        for(int i = 0 ;i<arr.length;i++){
            System.out.print("[ ");
            for(int j = 0 ;j<arr[i].length;j++){
                arr[i][j]= in.nextInt();
            }
            System.out.println(" ]");
            System.out.print(",");
        }
        System.out.println(":"+wealthyPerson(arr));
    }
    public static int wealthyPerson(int [][]arr){
        int ans=Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++){
            int sum=0;
            for(int j = 0 ;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}

