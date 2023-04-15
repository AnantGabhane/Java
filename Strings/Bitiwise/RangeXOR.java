public class RangeXOR {
    public static void main(String[] args) {
        // for xor of range a to b is xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;
        int ans = XOR(b) ^ XOR(a - 1);
        System.out.println(ans);
    }

    static int XOR(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
