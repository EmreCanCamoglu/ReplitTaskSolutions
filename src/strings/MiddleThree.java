package strings;

import java.util.Scanner;

public class MiddleThree {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int i = 0;
        //YOUR CODE HERE
        if (word.length() < 5 || word.length() % 2 == 0)
            System.out.println("invalid");
        else
            i = word.length() / 2;
        System.out.println(word.substring(i - 1, i + 2));


    }
}
