package simple_programs;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no. till you want to print fibo:");
     int  n = in.nextInt();
     int i = 0;
     int j = 1;
     if(n==1) {
         if (n == 1) {
             System.out.println(i);
         }
     }
           if(n== 2){
               System.out.println(i);
        System.out.println(j);
              }
      if (n>2){
          System.out.println(i);
          System.out.println(j);
         for(int k=2;k<n;k++)
         {
             int sum = i+j;
             System.out.println(sum);
             i=j;
             j=sum;
         }
     }


    }
}
