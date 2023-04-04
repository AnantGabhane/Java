public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            // loop will contain max item from the array
            end += nums[i];
        }

        // binary search on it
        while (start < end) {
            // mid as a ans
            int mid = start + (end - start) / 2;

            // how many peies you can divide this sum into
            int sum = 0;
            int pieses = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // cannot add in subarry make new
                    sum = num;
                    pieses++;
                } else {
                    sum += num;
                }
            }
            if (pieses > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
