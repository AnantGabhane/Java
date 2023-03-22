import java.util.concurrent.CountDownLatch;

public class EvenNum {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    // function to check if number contains even number of digits or not
    static boolean even(int num) {
        int numberofDigits = countDigits(num);
        return numberofDigits % 2 == 0;
        // if (numberofDigits % 2 == 0) {
        // return true;
        // }

    }

    static int countDigits2(int num) {
        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num) + 1);
    }

    // function to count number of digits in a number
    static int countDigits(int num) {

        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
