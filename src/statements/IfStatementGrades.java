package statements;

import java.util.Scanner;

public class IfStatementGrades {
    public static void main(String[] args) {

        Scanner saw = new Scanner(System.in);

        int grade = saw.nextInt();

        if (grade >= 90) {
            System.out.println("excellent");
        }
        if (grade >= 70 && grade <= 89) {
            System.out.println("good");
        }
        if (grade > 60 && grade <= 69) {
            System.out.println("pass");
        }
        if (grade <= 60) {
            System.out.println("fail");
        }

    }
}
