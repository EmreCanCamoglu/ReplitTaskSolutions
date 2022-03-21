package methods;

import java.util.Scanner;

public class MethodsWithReturn_SimpleRoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        if (isAvailable) {
            if (year == 2018) {
                if (month == 7) {
                    if (day >= 1 && day <= 8)
                        return false;
                    else
                        return true;

                } else
                    return true;

            } else
                return false;
        } else
            return false;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
