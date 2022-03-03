package loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countOfhi = 0;
        while (str.contains("hi")) {

            str = str.replaceFirst("hi", "");
            countOfhi++;
        }
        System.out.println(countOfhi);


    }
}
