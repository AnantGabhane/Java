public class Reverse {
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    static int rev2(int n) {
        // somrtimes you may need to have variable base in the arguments
        // then make another function, called helper() function
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1) + helper(n / 10, digits - 1));
    }

    public static void main(String[] args) {

        System.out.println(rev2(1234));
    }

}
