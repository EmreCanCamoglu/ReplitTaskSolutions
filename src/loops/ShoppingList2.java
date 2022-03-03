package loops;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item;
        String countinue;
        double price;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();
            scan.nextLine();
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
            totalPrice += price;
            System.out.println("Add one more item?");
            countinue = scan.nextLine();

            if (countinue.equals("no")) {
                break;
            }

            shoppingListReport += ", ";
            count++;
        } while (count < 11);


        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);


    }
}
