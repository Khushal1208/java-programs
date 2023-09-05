package simple_programs;

import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("find factorial of :");
        int num = sc.nextInt();
        int i,fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("simple_programs.Factorial of "+num+" is: "+fact);
    }
}

