public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(NumSum(13420));
    }

    static int NumSum(int n) {
        return n == 0 ? 0 : (n % 10) + NumSum(n / 10);
    }
}
