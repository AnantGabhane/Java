import java.util.Arrays;

public class Search2Darray {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 }
        };
        int target = 34;
        int[] ans = search(arr, target); // return value of row and col
        System.out.println(Arrays.toString(ans));

        System.out.println(searchMax(arr));
    }

    // prints index of target element in an array
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    // prints maximum element in an array
    static int searchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        return max;
    }

}
// op: [2, 2]
// 99