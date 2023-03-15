import java.util.Scanner;

public class Casecheak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        char ch = in.next().trim().charAt(0);
        //both should be true for cond to be true
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase " + ch);
        }else{
            System.out.println("Uppercase " + ch);
        }
        
        
        
        
       // System.out.println(ch);



        
        //first word at index zero is taken out
        // String word ="hello";
        // System.out.println(word.charAt(2));
    }
}
