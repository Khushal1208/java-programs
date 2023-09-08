package linear_search;
public class maximum {
    public static void main(String[] args) {
        int [] arr = {1111,-222,44,-6,64,56,90,77};
        System.out.println("maximum:"+min(arr));
    }
    public static int min(int [] arr){
        int max=Integer.MIN_VALUE;      //used to store any random max value
        for (int i : arr) {      //enhance for loop
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
