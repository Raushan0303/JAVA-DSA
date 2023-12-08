import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;
        while (true){
            System.out.println("ENter the operator:");
            char op = in.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                //input two numbers
                System.out.println("Enter the two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op=='+'){
                    ans = num1+num2;
                    System.out.println("Your sum is "+ans);
                }
                if(op=='-'){
                    ans = num1-num2;
                    System.out.println("Your substraction is "+ans);
                }
                if(op=='*'){
                    ans = num1*num2;
                    System.out.println("Your multiplication is "+ans);
                }
                if(op=='/'){
                    if (num2 != 0) {
                        ans = num1/num2;
                        System.out.println("Your division is "+ans);
                    }
                   
                }
                if(op=='%'){
                    ans = num1%num2;
                    System.out.println("Your remainder is "+ans);
                } else if (op=='x'||op=='X') {
                    break;
                }



            }
        }
    }
}
