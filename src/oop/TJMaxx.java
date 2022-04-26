package oop;

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {
    public static void main(String[] args) {

    }
}


//Items Class

class Item {

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price         assigns to values to instance variables
     */
    public Item(String name, int quantity, int catalogNumber, double price) {
        this.name = name;
        this.quantity = quantity;
        this.catalogNumber = catalogNumber;
        this.price = price;


    }

    /**
     * getter for price
     *
     * @return
     */
    public double getPrice() {

        return this.price;
    }

    /**
     * setter for private price
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;

    }

    /**
     * getter for name
     *
     * @return
     */
    public String getName() {


        return this.name;
    }

    /**
     * setter for name instance variable
     *
     * @param name
     */
    public void setName(String name) {

        this.name = name;

    }

    public int getQuantity() {

        return this.quantity;

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public int getCatalogNumber() {

        return this.catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {

        this.catalogNumber = catalogNumber;


    }

    /**
     * Override toString:
     *
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    @Override
    public String toString() {
        return "Regular Item{name=" + this.name + " , catalogNumber=" + this.catalogNumber + ", quantity=" + this.quantity + ", price=" + this.price + "}";
    }

}

//ONSale class


class OnSaleItem extends Item {
    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount      - Calls Super class constructor by passing name,quantity,catalogNumber,price
     *                      - it will assign the price after deducting(minus) discount from the price
     *                      - assigns discount
     */
    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
        super(name, quantity, catalogNumber, price);
        this.discount = discount;

    }

    /**
     * getter for discount
     *
     * @return
     */
    public double getDiscount() {

        return this.discount;
    }

    /**
     * setter for discount
     *
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;

    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     * * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     */
    @Override
    public String toString() {
        return "OnSaleItem{discount=" + this.discount + "%, name=" + getName() + ", price=" + getPrice() + "}";
    }
}


// TJMaxx Class


class TJMaxxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxxx() {
        this.regularItems = new ArrayList<>();
        this.onSaleItems = new ArrayList<>();

    }

    /**
     * adds an item object to regularItems list
     *
     * @param item
     */
    public void addRegularItem(Item item) {

        this.regularItems.add(item);


    }

    /**
     * adds OnSaleItem object to onSaleItems list
     *
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        this.onSaleItems.add(item);


    }

    /**
     * getter for regularItems
     *
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     *
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     *
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     *
     * @return
     */
    public int onSaleItemsCount() {

        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     *
     * @return
     */
    public List<String> getAllItemNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Item regularItem : regularItems) {
            names.add(regularItem.getName());
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            names.add(onSaleItem.getName());
        }
        return names;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     *
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        for (Item regularItem : regularItems) {
            if (regularItem.getCatalogNumber() == catalogNumber)
                return regularItem.getPrice();
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber() == catalogNumber)
                return onSaleItem.getPrice();
        }
        System.out.println("Invalid Catalog Number");
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     *
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getName().equals(name))
                return onSaleItem;
        }
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     *
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        regularItems.removeIf(regularItem -> regularItem.getCatalogNumber() == catalogNumber);
        onSaleItems.removeIf(onSaleItem -> onSaleItem.getCatalogNumber() == catalogNumber);

    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     * - decrease the count of the Item by 1
     * - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        for (Item regularItem : regularItems) {
            if (regularItem.getCatalogNumber() == catalogNumber)
                regularItem.setQuantity(regularItem.getQuantity() - 1);
            if (regularItem.getQuantity() < 1)
                removeItem(catalogNumber);
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber() == catalogNumber)
                onSaleItem.setDiscount(onSaleItem.getQuantity() - 1);
            if (onSaleItem.getQuantity() < 1)
                removeItem(catalogNumber);
        }
    }


}


