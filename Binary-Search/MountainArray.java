public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
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
}
