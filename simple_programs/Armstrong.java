package simple_programs;

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check");
        int num=sc.nextInt();
       int num1,num2,num3,sum;
       num1=num/100; //1
       num2=num%10;  //3
       num3=((num/10)%10);    //15  //%5
        sum=num1*num1*num1+num2*num2*num2+num3*num3*num3;
        if(num==sum){
            System.out.println("it is simple_programs.Armstrong");
        }
        else {
            System.out.println("no");
        }

    }
}
