package Assignment;
import java.util.*;
public class AREA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter following L,B,SIDE,W,R :");
        double r,H,B,side,W;
        r=sc.nextDouble();
        H=sc.nextDouble();
        B=sc.nextDouble();
       side =sc.nextDouble();
        W=sc.nextDouble();
        System.out.println("Enter your shape (circle,triangle,rectangle,isosceles,Parallelogram,rhombus,equilatral):");
        String ch=sc.next();
        double area;
        double pi= 3.14;

        switch(ch){
            case "circle":
                area=pi*Math.pow(r,2);
                System.out.println("area of circle is"+" "+area);
                break;
            case "triangle":
                area=1/2*(B*H);
                System.out.println("area of traingle is"+" "+area);
                break;
            case "rectangle":
                area=H*B;
                System.out.println("area of rectangle is"+" "+area);
                break;
            case "isosceles":
                area=1/2*(H*B);
                System.out.println("area of isosceles is"+" "+area);
                break;
            case "Parallelogram":
                area=H*B;
                System.out.println("area of Parallelogram is"+" "+area);
                break;
            case "rhombus":
                area=H*B;
                System.out.println("area of rhombus is"+" "+area);
                break;
            case "equilatral":
                area=Math.sqrt(3)/4*side*side;
                System.out.println("area of equilatral is"+" "+area);
                break;

            default:
                System.out.println("wrong input");
        }


    }
}
