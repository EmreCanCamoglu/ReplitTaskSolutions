package statements;

import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int seniorCitizens, nonSeniorCitizens, age;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = input.nextInt();
        input.nextLine();
        nonSeniorCitizens = input.nextInt();
        input.nextLine();
        System.out.println("What is new citizen's age?");
        age = input.nextInt();

        if (age >= 65) {
            seniorCitizens += 1;
            System.out.println("Senior Citizen");
        } else {
            nonSeniorCitizens += 1;
            System.out.println("Non-Senior Citizen");
        }

        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);

    }
}
