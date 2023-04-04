import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(Search(arr, 9)));
    }

    // search in row between col
    static int[] BinarySearch(int[][] matrix, int row, int Cstart, int Cend, int target) {

        while (Cstart <= Cend) {
            int mid = Cstart + (Cend - Cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }

            if (matrix[row][mid] == target) {
                Cstart = mid + 1;
            } else {
                Cend = mid - 1;
            }
        }

        return new int[] { -1, -1 };
    }

    static int[] Search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return BinarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int Cmid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][Cmid] == target) {
                return new int[] { mid, Cmid };
            }
            if (matrix[mid][Cmid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][Cmid] == target) {
            return new int[] { rStart, Cmid };

        }
        if (matrix[rStart + 1][Cmid] == target) {
            return new int[] { rStart + 1, Cmid };
        }

        // search in 1st half
        if (target <= matrix[rStart][Cmid - 1]) {
            return BinarySearch(matrix, rStart, 0, Cmid - 1, target);

        }
        // search in 2nd half
        if (target >= matrix[rStart][Cmid + 1] && target <= matrix[rStart][cols - 1]) {
            return BinarySearch(matrix, rStart, Cmid + 1, cols - 1, target);

        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][Cmid - 1]) {
            return BinarySearch(matrix, rStart + 1, 0, Cmid - 1, target);

        } else {
            return BinarySearch(matrix, rStart + 1, Cmid + 1, cols - 1, target);

        }
        // return new int[] { -1, -1 };
    }
}