public class Pattern1 {
    public static void main(String[] args) {
        pattern32(4);
    }

    static void pattern32(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalCol;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row run a col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // after each row print a new line
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row run a col
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            // after each row print a new line
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row run a col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // after each row print a new line
            System.out.println();
        }
    }

    static void Pattern(int n) {
        for (int row = 1; row <= n; row++) {
            // for each row run a col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // after each row print a new line
            System.out.println();
        }
    }
}
/*
 * pattern
 * 
 * *
 * * *
 * * * *
 */

/*
 * pattern 2
 * * * *
 * * * *
 * * * *
 * * * *
 */

/*
 * pattern 3
 * * * * *
 * * *
 * *
 *
 */