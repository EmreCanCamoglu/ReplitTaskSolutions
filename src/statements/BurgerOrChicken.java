package statements;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        float price;

        if (in.equals("burger") || in.equals("chicken")) {
            price = 10.0f;
            System.out.println(price);

        }
        if (in.equals("soda")) {
            price = 2.0f;
            System.out.println(price);

        }
        if (in.equals("fries")) {
            price = 3.5f;
            System.out.println(price);

        }


    }
}
