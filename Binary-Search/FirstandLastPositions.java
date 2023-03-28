public class FirstandLastPositions {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] =start;
        ans[1] = end;
    }

    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2;
            // this might exceed range of integer

            int mid = start + (end - start) / 2;

            // element exist in left hand side
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
                // element exist in right hand side
            } else {
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            // if it does not exist

        }
        return -1;
    }
}
