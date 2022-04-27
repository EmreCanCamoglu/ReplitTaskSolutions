package projects;

import java.util.Scanner;

public class OnlineBookMerchants {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        int remaining = 0;
        if (isPremiumCustomer) {
            remaining = nbooksPurchased % 8;
            freeBooks = 2 * (nbooksPurchased / 8) + remaining / 5;
        } else {
            remaining = nbooksPurchased % 12;
            freeBooks = 2 * (nbooksPurchased / 12) + remaining / 7;
        }
        System.out.println(freeBooks);


    }
}
