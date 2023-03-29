public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;

        System.out.println(search(arr, target));
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } // otherwise try to search in other half

        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // desceasing part of array
                // may be ans but look at left
                end = mid;
            } else {
                // ascending part of array
                start = mid + 1;
                // mid + 1 > mid element
            }
        }
        // start ==end means its the largest element in array
        // start and end are trying to findL max element
        return start;
    }

    // dont know start and end
    // sliding windows approach
    static int binarySearch(int[] arr, int target, int start, int end) {

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
