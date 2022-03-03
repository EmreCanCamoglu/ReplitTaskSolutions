package arrays;

import java.util.Scanner;

public class SplitPersonInfo {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {

        String[] mem = info.split(",");

        System.out.println("person name: " + mem[0]);
        System.out.println("last name: " + mem[1]);
        System.out.println("age: " + mem[2]);
    }


}

