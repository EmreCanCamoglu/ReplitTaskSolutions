package variables;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {

        double n1, n2, n3, n4, n5;
        String l1, l2, l3, l4, l5;

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        l1 = s.nextLine();
        n1 = s.nextDouble();
        s.nextLine();


        System.out.println("Please enter subject name number 2 and score for this subject");
        l2 = s.nextLine();
        n2 = s.nextDouble();
        s.nextLine();

        System.out.println("Please enter subject name number 3 and score for this subject");
        l3 = s.nextLine();
        n3 = s.nextDouble();
        s.nextLine();

        System.out.println("Please enter subject name number 4 and score for this subject");
        l4 = s.nextLine();
        n4 = s.nextDouble();
        s.nextLine();

        System.out.println("Please enter subject name number 5 and score for this subject");
        l5 = s.nextLine();
        n5 = s.nextDouble();
        s.nextLine();


        System.out.println("Summary: " + l1 + " - " + n1 + ", " + l2 + " - " + n2 + ", " + l3 + " - " + n3 + ", " + l4 + " - " + n4 + ", " + l5 + " - " + n5);
        System.out.println("Your average score is: " + (n1 + n2 + n3 + n4 + n5) / 5);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
    }
}
