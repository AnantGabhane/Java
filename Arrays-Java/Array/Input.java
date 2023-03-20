import java.util.Scanner;
import java.util.Arrays;


public class Input {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int arr[] = new int[5];
        //array of primitive types
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        //System.out.println(Arrays.toString(arr));

        //printing via for loop
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");        
        // }
    
            
        //array of objects
        String str[] = new String[4];
        for (int i = 0; i < str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
