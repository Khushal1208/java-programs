package linear_search;
import java.util.*;
public class search_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = in.next();
        System.out.println("Enter target:");
        char target = in.next().charAt(0); //to give single char as input we have to convert string into char example: in.next().charAt(0)
        System.out.println(search(name,target));
    }
    public static boolean search(String str, char target){
        if(str.length()==0){
            return  false;
        }
        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i)==target){
                return true;     //it will give false if input target is in uppercase
            }
        }
        return false;
    }
}
