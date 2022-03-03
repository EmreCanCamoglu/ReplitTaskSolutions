package variables;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        inputSeconds = s.nextInt();

        hours = inputSeconds / 3600;
        inputSeconds -= hours * 3600;
        minutes = inputSeconds / 60;
        inputSeconds -= minutes * 60;
        seconds = inputSeconds;
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
    }
}
