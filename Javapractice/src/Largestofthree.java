import java.util.Scanner;

public class Largestofthree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        System.out.println("enter the third number");
        int c = in.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is greatest");
            } else {
                System.out.println("c is greatest");
            }
        } else {
            if (b > c) {
                System.out.println("b is greatest");

                } else {
                    System.out.println("c is greatest");
                }
            }
        }
    }
