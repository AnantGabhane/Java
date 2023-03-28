public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap 2 numbers
        // int temp = a;
        // b=a;
        // b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        // String name = "Anant Gabhane";
        // changeName(name);
        // System.out.println(name);

    }

    static void changeName() {

    }

    static void swap(int a, int b) {
        int temp = a;
        b = a;
        b = temp;
    }
}
// java cannot swap due to pass by value thing