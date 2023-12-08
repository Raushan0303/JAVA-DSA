import java.util.Scanner;

public class Upperlower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = in.next().trim().charAt(0);
        if(ch >= 65 && ch <= 97){
            System.out.println(ch+ " is uppercase");
        }
        else {
            System.out.println(ch+" is lowercase");
        }



    }
}
