package statements;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number:");
        num1 = s.nextInt();

        System.out.println("Enter second number:");
        num2 = s.nextInt();

        System.out.println("Enter third number:");
        num3 = s.nextInt();

        if (num1 < num2 && num1 > num3) {

            System.out.println("Medium value is: " + num1);
        }
        if (num1 < num3 && num1 > num2) {

            System.out.println("Medium value is: " + num1);
        }
        if (num2 < num1 && num2 > num3) {

            System.out.println("Medium value is: " + num2);
        }
        if (num2 < num3 && num2 > num1) {

            System.out.println("Medium value is: " + num2);
        }
        if (num3 < num2 && num3 > num1) {

            System.out.println("Medium value is: " + num3);
        }
        if (num3 < num1 && num3 > num2) {

            System.out.println("Medium value is: " + num3);
        }


    }
}
