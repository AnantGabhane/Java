//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {

        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end)/2;
            // this might exceed range of integer

            int mid = start + (end - start) / 2;

            // element exist i left hand side
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
                // element exist in right hand side
            }
        }
        // if it does not exist
        return letters[start % letters.length];
    }
}
