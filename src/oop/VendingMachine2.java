package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingMachine2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DrinkVendingMachine vending = new DrinkVendingMachine(
                new Drink("Iced Coffee", 4.50, 10),
                new Drink("Iced Tea", 2.50, 5),
                new Drink("Smart Water", 4.0, 20),
                new Drink("Coke", 2.30, 13));


        vending.select(in.nextInt());
        System.out.println(vending.current.toString()); //Drink{name='Iced Coffee', cost=4.5, quantity=10}
        while (vending.pay(in.nextDouble()) > 0) {
            System.out.println("You have paid " + (vending.current.getCost() - vending.amountLeftToPay) + " remaining: " + vending.amountLeftToPay);
            System.out.println("Do you want to continue? y/n");
            switch (in.next()) {
                case "y":
                    break;
                case "n":
                    vending.cancel();
                    System.exit(0);
                default:
            }
        }


    }
}

class DrinkVendingMachine extends VendingMachine {
    public List<Drink> drinks = new ArrayList<>();

    /**
     * current will refer to currently selected drink
     */
    public Drink current;
    /**
     * after selecting the drink, whatever amount customer owes for the drink
     */
    public double amountLeftToPay;
    /**
     * after paying for the drink whatever amount is change
     */
    public double change;
    /**
     * used to check if drink is currently selected or no
     */
    public boolean isSelected;

    /**
     * public constructor.
     *
     * @param drinksParam VAR-ARGs.
     *                    Assign each Drink object into drinks list
     */
    public DrinkVendingMachine(Drink... drinksParam) {
        drinks.addAll(Arrays.asList(drinksParam));
    }

    @Override
    public void select(int itemNumber) {
        if (!(itemNumber >= 0 && itemNumber < drinks.size())) {
            this.current = new Drink("empty", 0, 0);
            this.isSelected = false;
        } else {
            this.isSelected = true;
            this.current = drinks.get(itemNumber);
            this.amountLeftToPay = current.getCost();
        }
    }

    @Override
    public double pay(double money) {

        if (!isSelected)
            return 0;
        else {
            this.amountLeftToPay = this.amountLeftToPay - money;
            if (this.amountLeftToPay < 0) {
                this.current.setQuantity(current.getQuantity() - 1);
                this.change = this.amountLeftToPay * -1;
                System.out.println("Here is your change: " + returnChange());
            }


        }
        return this.amountLeftToPay;


    }

    @Override
    public double returnChange() {
        double change = this.change;
        this.change = 0;
        this.amountLeftToPay = 0;
        return change;
    }

    @Override
    public void cancel() {
        System.out.println("Here is your refund:" + (current.getCost() - amountLeftToPay));
        this.current = null;
        this.amountLeftToPay = 0;
        this.isSelected = false;
    }
}

class Drink {
    private String name;
    private double cost;
    private int quantity;

    public Drink(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    /**
     * @return String in this format:
     * Drink{name='Iced Coffee', cost=4.5, quantity=10}
     */
    @Override
    public String toString() {

        return "Drink{name=" + this.name + ", cost=" + this.cost + ", quantity=" + this.quantity + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

abstract class VendingMachine {
    public abstract void select(int itemNumber);

    public abstract double pay(double money);

    public abstract double returnChange();

    public abstract void cancel();

}
