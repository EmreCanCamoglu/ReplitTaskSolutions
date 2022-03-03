package statements;

import java.util.Scanner;

public class HappyValleySchoolSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        if (age < 2) {
            System.out.println("ineligible");
        } else if (age == 2) {
            System.out.println("toddler");
        } else if (age < 6) {
            System.out.println("early childhood");
        } else if (age < 8) {
            System.out.println("young reader");
        } else if (age < 11) {
            System.out.println("elementary");
        } else if (age < 13) {
            System.out.println("middle");
        } else if (age == 13) {
            System.out.println("impossible");
        } else if (age < 17) {
            System.out.println("high school");
        } else if (age < 19) {
            System.out.println("scholar");
        } else {
            System.out.println("ineligible");
        }
    }
}
