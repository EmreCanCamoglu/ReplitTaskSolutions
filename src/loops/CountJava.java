package loops;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int countOfjava = 0;
        while (word.contains("java")) {

            word = word.replaceFirst("java", "");
            countOfjava++;
        }
        System.out.println(countOfjava);


    }
}
