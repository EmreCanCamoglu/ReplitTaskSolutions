package statements;

import java.util.Scanner;

public class ConditionalStatementPractice3 {

    public void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();

        if ("Chen".equals(name)) {
            System.out.println("teacher");
        } else {
            System.out.println("student");
        }
    }
}

