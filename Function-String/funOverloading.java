import java.util.Arrays;

public class funOverloading {
    public static void main(String[] args) {
        fun(65);
        fun("ANabt");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}