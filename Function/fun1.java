package Function;
import java.util.Scanner;
public class fun1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: "); 
        
        String name = in.next();

        String personal = mygreet("Anant");
        System.out.println(personal);
    }
    static String mygreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
