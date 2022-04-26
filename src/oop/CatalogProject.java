package oop;

import java.util.ArrayList;

public class CatalogProject {
    public static void main(String[] args) {
        Catalog ctl = new Catalog();
        ctl.loadItems();
        ctl.loadPrices();
        ctl.loadMonthlyPayments();

        System.out.println(ctl.items.toString());
        System.out.println(ctl.prices.toString());
        System.out.println(ctl.monthlyPayments.toString());

        Catalog ctl2 = new Catalog();
        ctl2.loadWholeCatalog();
        System.out.println(ctl2.getWholeCatalog());
        System.out.println(ctl2.getItemDetails("MacbookPro"));
        System.out.println(ctl2.getItemDetails("Potato"));
        System.out.println(ctl2.getItemsLessThanAMonthlyPrice(3).toString());
        ctl2.updatePrice("MacbookPro", 100.99);
        System.out.println(ctl2.getItemDetails("MacbookPro"));
        ctl2.deleteItemFromCatalog("Charger");
        System.out.println(ctl2.getWholeCatalog());

    }
}

class Catalog {
    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    ArrayList<Double> monthlyPayments = new ArrayList<>();


    public void loadItems() {
        items.add("iPhone 6s");
        items.add("iPhone 6s Plus");
        items.add("iPhone X");
        items.add("MacbookPro");
        items.add("ThumbDrive");
        items.add("Beats HeadPhones");
        items.add("Mouse");
        items.add("Charger");
        items.add("iPad");
        items.add("Dyson Vacuum");
        items.add("TV");
        items.add("Apple Watch");

    }

    public void loadPrices() {
        prices.add(449.0);
        prices.add(549.0);
        prices.add(1149.0);
        prices.add(1499.99);
        prices.add(39.99);
        prices.add(349.99);
        prices.add(79.99);
        prices.add(39.99);
        prices.add(429.0);
        prices.add(399.0);
        prices.add(2199.0);
        prices.add(559.0);


    }

    public void loadMonthlyPayments() {
        monthlyPayments.add(18.71);
        monthlyPayments.add(22.88);
        monthlyPayments.add(56.16);
        monthlyPayments.add(79.49);
        monthlyPayments.add(2.68);
        monthlyPayments.add(15.12);
        monthlyPayments.add(8.98);
        monthlyPayments.add(4.56);
        monthlyPayments.add(18.31);
        monthlyPayments.add(16.25);
        monthlyPayments.add(89.49);
        monthlyPayments.add(21.18);
    }

    public void loadWholeCatalog() {
        loadItems();
        loadPrices();
        loadMonthlyPayments();
    }

    public String getWholeCatalog() {

        int i = 0;
        String output = "";
        while (items.size() > i) {
            output += items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i) + "\n";
            i++;
        }
        return output;
    }

    public String getItemDetails(String item) {
        int i = 0;
        for (String s : items) {
            if (s.equals(item))
                return s + "-" + prices.get(i) + "-" + monthlyPayments.get(i);
            i++;
        }

        return null;
    }

    public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {

        ArrayList<String> gILTAMP = new ArrayList<>();
        int i = 0;

        for (Double monthlyPayment : monthlyPayments) {
            if (monthlyPayment <= price)
                gILTAMP.add(items.get(i) + "-" + prices.get(i) + "-" + monthlyPayment);

            i++;

        }
        return gILTAMP;
    }

    public void updatePrice(String item, double newPrice) {

        int i = 0;
        for (String s : items) {
            if (s.equals(item)) {
                prices.set(i, newPrice);
                monthlyPayments.set(i, newPrice / 12);
            }
            i++;

        }
    }

    public void deleteItemFromCatalog(String item) {

        int i = 0;
        for (String s : items) {
            if (s.equals(item)) {
                items.remove(i);
                prices.remove(i);
                monthlyPayments.remove(i);
                break;
            }
            i++;
        }


    }

}