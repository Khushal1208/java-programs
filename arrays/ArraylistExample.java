package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        //Syntax .  integer will not work ,Integer will work.
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);    // here the limit of aaraylist is 10 but i have written 12 values but it will not give error
        list.add(12);    // it will increase arraylist sice when limit of arraylist is half full .
        System.out.println(list);
        System.out.println(list.contains(11));   //it is boolean function
        list.set(5,333);   //list.set(index,new number);
        list.remove(7);  //list.set(index);
        list.add(in.nextInt());   //to take input in list

        for(int i=0 ; i<9 ; i++) {
            System.out.print(list.get(i)+" ");    //list.get(index);    list[index] will not work
        }                                         // it will get particular range list
        System.out.println();
        System.out.println(list);   //it will get total list
    }
}
