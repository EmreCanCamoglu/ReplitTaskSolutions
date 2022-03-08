package Methods;

import java.util.Scanner;

public class FindCube {

    public static void cube() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num * num * num);
    }


    public static void main(String[] args) {

        cube();

    }
}
