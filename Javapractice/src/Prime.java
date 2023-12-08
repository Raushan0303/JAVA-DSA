import java.util.Scanner;
import java.util.function.Function;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        prime(a);

    }
    public static void prime(int num){
        int flag= 0;
        for (int i=2; i<num/2;i++){
            if(num%i==0){
                System.out.println(num+" is not prime number");
                flag = 1;
                break;
            }
        }

        if(flag==0)  {
                System.out.println(num+" is prime number");
            }
        }

    }



