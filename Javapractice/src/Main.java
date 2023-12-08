import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        int a = sc.nextInt();
        int bonus = 0;
        if (a>10000){
            bonus+=2000;
            System.out.println("salary is above 10000 so "+bonus+" they get as bonus");
        }
        else{
            bonus+=1000;
            System.out.println("salary is less than 10000 so they will get only "+bonus+" as bonus");
        }
    }
}