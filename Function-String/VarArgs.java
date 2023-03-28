import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(3,4,5,465,4,64,64,654,64,64,6,4,64);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
