//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][] {
            { 23, 4, 1 },
            { 18, 12, 3, 9 },
            { 78, 99, 34, 56 }
    };
    System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
