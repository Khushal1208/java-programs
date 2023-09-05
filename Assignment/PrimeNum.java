package Assignment;

import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check");
        int num = sc.nextInt();
        int c= 0;
           for(int i= 2;i<=num;i++){
               if(num % i == 0){
                   c++;
               }
        }
           if(c == 1){
               System.out.println("prime number");
           }
           else{
               System.out.println("not a prime number");
           }

    }
}