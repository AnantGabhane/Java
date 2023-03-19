import java.util.Scanner;

public class fun1 {
    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.println(ans);
        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    //passing arguments
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
        
    }
}
