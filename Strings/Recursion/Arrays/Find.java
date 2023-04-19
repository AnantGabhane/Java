package Arrays;

public class Find {
    public static void main(String[] args) {

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    // return the index value
    
}
