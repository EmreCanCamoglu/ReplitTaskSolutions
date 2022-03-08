package Methods;

import java.util.Scanner;

public class MethodsWithReturn_ProfitOrLoss {
    public static String profits(int buyPrice, int sellPrice) {
        if (buyPrice < sellPrice)
            return "profit";
        else if (buyPrice == sellPrice)
            return "no loss";
        else return "loss";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }
}
