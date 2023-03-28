public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target =10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // find rage of window
        // lets start with box of size 2
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;// new start
            // double box size
            // end = previous end + sizeofbox *2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
