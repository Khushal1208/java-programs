package methods;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        System.out.println("sum = "+sum());
    }
    static int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers to add :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n+m;
//        System.out.println("sum= "+sum);
        return sum;
    }
}
