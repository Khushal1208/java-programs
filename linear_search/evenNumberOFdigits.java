package linear_search;
import java.util.*;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evenNumberOFdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter sixe and elements:");
        int [] arr = new int[in.nextInt()];
        Arrays.setAll(arr, i -> in.nextInt());   //another way to take input
        System.out.println("total number of even digits of number : "+search(arr));
    }
    public static int search(int[] arr){
        //total even count
        int count = 0;
        for(int j:arr){
            if(evencount(j)){
                count++;

            }
        }
        return count;
    }
    public static boolean evencount(int j){
        //check count is even or not
        int numberofDigits = digits(j);
        return numberofDigits%2==0;
    }
//    public static int digits(int j){
//        //count digits of elements in array
//        if(j<0){
//            j=j*-1;
//        }
//        if(j==0){
//            return -1;
//        }
//        int count = 0;
//        while(j>0){
//            count++;
//            j=j/10;
//        }
//        return  count;
//    }
    // alternate for above code is
    public static int digits(int j){
//        count digits of elements in array
        if(j<0){     //convert negative number into positve
            j=j*-1;
        }
        return  (int)(Math.log10(j))+1;
    }
}
