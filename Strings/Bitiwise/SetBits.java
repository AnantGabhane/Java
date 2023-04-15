public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        // method 1
        // int count = 0;
        // while (n > 0) {
        // if ((n & 1) == 1) {
        // count++;
        // }
        // n = n >> 1;
        // }
        // System.out.println(count);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbits(n));

    }

    static int setbits(int n) {
        int count = 0;
        // method 2
        // while (n > 0) {
        // count++;
        // n -= (n & -n);
        // }
        // method 3
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
