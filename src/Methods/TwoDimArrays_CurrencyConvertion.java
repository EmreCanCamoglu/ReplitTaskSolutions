package Methods;

import java.util.Scanner;

public class TwoDimArrays_CurrencyConvertion {
    public static double convertC(String[][] money, String[][] convertionRate) {
        double dollars = 0;
        for (String[] value : money) {
            for (String[] strings : convertionRate) {
                if (value[0].equalsIgnoreCase(strings[0])) {
                    dollars += Double.parseDouble(value[1]) * Double.parseDouble(strings[1]);
                }
            }

        }
        return dollars;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many types of currencies do you have Mr. Bob?");
        int mcount = in.nextInt();
        String[][] money = new String[mcount][2];
        String[][] convert = new String[mcount][2];
        System.out.println("Please enter your money types and amounts respectively");
        for (int i = 0; i < mcount; i++) {
            for (int j = 0; j < 2; j++) {
                money[i][j] = in.next();
            }
        }
        System.out.println("This time enter your currencies current ratios / per dollar");
        for (int i = 0; i < mcount; i++) {
            for (int j = 0; j < 2; j++) {
                convert[i][j] = in.next();
            }
        }
        double res = TwoDimArrays_CurrencyConvertion.convertC(money, convert);
        System.out.println("Here is your total amount of money in dollars dear Bob. Have a nice day!");
        System.out.print(res);

    }
}
