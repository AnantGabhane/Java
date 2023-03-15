import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //user input x program stops working\
        int ans=0;
        while(true){
            //take operator input
            System.out.println("Enter operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' ||op == '*' || op == '/' || op == '%' ){
                //take 2 int as input and save them
                System.out.println("Enter two numbers:");

                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                
                if(op == '+'){
                    ans=num1+num2;
                }
                if(op == '-'){
                    ans=num1-num2;
                }
                if(op == '*'){
                    ans=num1*num2;
                }
                if(op == '/'){
                    if(ans!=0){
                        ans=num1/num2;
                    }
                }
                if(op == '%'){
                    ans=num1%num2;
                }
            }else if(op == 'X' || op == 'x'){
                break;
            }else{
                System.out.println("Invalid operator");
            }
            System.out.println(ans);

        }
    }
}
