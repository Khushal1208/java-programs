package linear_search;

public class search_syntax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;
        System.out.println("at index ="+search(arr, target));
    }

    public static int search(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i; // Found the target, return its index
//            }
//        }
        for(int i:arr){      //using for each loop
            if (arr[i] == target) {
                return i; // Found the target, return its index
            }
        }
        return -1; // Target not found in the array
    }
}
