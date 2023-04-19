public class Concept {
    public static void main(String[] args) {
        System.out.println(con(5));
    }

    static int con(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        // return con(n--); infintite recursion function calls
        return con(--n);
        // recursion after pass but subtraction happens first
    }
}
