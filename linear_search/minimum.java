package linear_search;
public class minimum {
    public static void main(String[] args) {
        int [] arr = {1111,-222,44,-6,64,56,90,77};
        System.out.println("minimum:"+min(arr));
    }
    public static int min(int [] arr){
        int min=Integer.MAX_VALUE;      //used to store any random max value 
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
