public class OrderAgnostics {
    public static void main(String[] args) {
        // int[] arr = { -18, -11, -9, -8, -2, 0, 2, 4, 6, 7, 8, 9, 14, 15, 22, 45, 67,
        // 89, 90, 100 };
        int[] arr = { 99, 80, 75, 22, 11, 10, 5, 2, -3 };
        int target = 22;
        int ans = OrderAgnosticsBS(arr, target);
        System.out.println(ans);
    }

    // find whether array is sorted in ascending or descending order

    static int OrderAgnosticsBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsen = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2;
            // this might exceed range of integer

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsen) {
                // element exist in left hand side
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                    // element exist in right hand side
                }
            } else {
                // element exist in left hand side
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                    // element exist in right hand side
                }
            }

        }
        // if it does not exist
        return -1;
    }
}