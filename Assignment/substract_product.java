package Assignment;
import java.util.*;
public class substract_product {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int rem,pro=1,sum=0;

        while(n>0){
            rem = n%10;
            pro = pro*rem;
            sum = sum+rem;
            n = n/10;
        }
        int result=pro-sum;
        System.out.println("result =" +result);


        }

    }


