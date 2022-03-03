package loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        while (word.contains("dog")) {

            word = word.replaceFirst("dog", "");
            countOfDogs++;


        }
        while (word.contains("cat")) {

            word = word.replaceFirst("cat", "");
            countOfCats++;


        }


        System.out.println(countOfCats == countOfDogs);

    }
}
