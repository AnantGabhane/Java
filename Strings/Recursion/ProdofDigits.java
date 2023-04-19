public class ProdofDigits {
    public static void main(String[] args) {
        System.out.println(NumSum(55));
    }

    static int NumSum(int n) {
        // return (n %= 10 == n) ? n : (n % 10) * NumSum(n / 10);
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * NumSum(n / 10);
    }
}
        