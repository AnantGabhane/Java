public class Floor {
    public static void main(String[] args) {
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 19, 22, 45, 89 };
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    // floor : greatest element smaller than target
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
        return end;
    }
}
