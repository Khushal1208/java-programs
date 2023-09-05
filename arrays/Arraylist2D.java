package arrays;
import java.util.*;

public class Arraylist2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
        //initialization

        for(int i=0;i<3;i++){
            // it is creating design of "arraylist of arraylist" like : [[] ,[] ,[]]
            list.add(new ArrayList<>());
        }
        // it is adding elements into the design
        for(int i=0 ; i<3 ; i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
