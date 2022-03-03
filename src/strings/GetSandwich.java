package strings;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.contains("bread")) {

            str = str.replaceFirst("bread", "[");
            if (str.contains("bread")) {
                System.out.println(str.substring(str.indexOf("[") + 1, str.lastIndexOf("bread")));

            } else
                System.out.println("nothing");


        } else
            System.out.println("nothing");


    }
}
