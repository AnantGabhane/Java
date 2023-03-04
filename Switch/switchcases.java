package Switch;

import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){
            case "Mango":System.out.println("King");break;
            case "Orange":System.out.println("Orange color round fruit");break;
            case "Grapes":System.out.println("small fruit ");break;
            case "Apple":   System.out.println("sweet and red");break;
            default:
            System.out.println("Please enter a valid fruit");
        }
    }
}
