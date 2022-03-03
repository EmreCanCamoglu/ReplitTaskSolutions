package loops;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countOfjava = 0;
        int countOfpython = 0;


        while (sentence.contains("java")) {

            sentence = sentence.replaceFirst("java", "");
            countOfjava++;


        }
        while (sentence.contains("python")) {

            sentence = sentence.replaceFirst("python", "");
            countOfpython++;


        }


        System.out.println(countOfjava == countOfpython);

    }
}
