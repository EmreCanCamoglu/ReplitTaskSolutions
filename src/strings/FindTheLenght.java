package strings;

import java.util.Scanner;

public class FindTheLenght {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = s.nextLine();
        int lenght = text.length();
        System.out.println("Length is: " + lenght);

    }
}
