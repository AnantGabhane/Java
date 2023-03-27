public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -11, -9, -8, -2, 0, 2, 4, 6, 7, 8, 9, 14, 15, 42, 45, 67, 89, 90, 100 };
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2;
            // this might exceed range of integer

            int mid = start + (end - start) / 2;

            // element exist in left hand side
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
                // element exist in right hand side
            } else {
                return mid;
            }
        }
        // if it does not exist
        return -1;
    }
}
