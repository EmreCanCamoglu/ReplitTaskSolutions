package oop;

import java.util.Scanner;

public class CarpetClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet();
        System.out.println(c.totalPrice);

        Carpet c2 = new Carpet(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
        System.out.println((int) c2.totalPrice);

    }
}

class Carpet {
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;

    public Carpet() {
        this.width = 300;
        this.length = 300;
        this.totalPrice = 200;
        this.unitPrice = 0;
        this.isPersian = false;

    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.totalPrice = unitPrice * (width + length);
        this.isPersian = isPersian;
        if (isPersian)
            this.totalPrice += 200;
    }
}
