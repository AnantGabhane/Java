package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID){
            case 1:
                System.out.println("Anant");
                break;
            case 2:
                System.out.println("Abhi");
                break;
            case 3:
                System.out.println("Employee number 3"); 
                switch(department){
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "HR":
                        System.out.println("HR dept");
                        break;
                    case "Management":
                        System.out.println("Management dept"); 
                        break;
                    default:
                        System.out.println("Invalid Department");
                }
            break;
            default:
                System.out.println("Invalid Employee ID");
        }
    }
}
