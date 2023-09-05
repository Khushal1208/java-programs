package simple_programs;

import java.util.*;
public class PalidromeNum {
    public static void main(String[] args) {
        int rem,rev=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check pelidrome");
        int num = sc.nextInt();
           temp=num;
            while(num>0)
            {
                rem = num % 10;
                rev = ( rev*10 )+ rem ;
                num = num/10;
            }

        System.out.println(rev);
        if(temp==rev)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

    }
}
