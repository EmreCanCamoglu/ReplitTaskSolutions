package statements;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int cou = s.nextInt();
        int cb, gm;
        if (cou >= 3) {

            cb = cou / 10;
            cou -= cb * 10;
            gm = cou / 3;
            System.out.println("Number of Candies: " + cb);
            System.out.println("Number of Gumballs: " + gm);


        } else {
            System.out.println("Not enough coupons");


        }


    }
}
