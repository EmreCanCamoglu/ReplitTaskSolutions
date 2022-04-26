package oop;

import java.util.Scanner;

public class GasTank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GasTankk gt = new GasTankk(in.nextDouble());
        gt.addGas(in.nextDouble());
        System.out.println(gt.isFull());
        gt.useGas(in.nextDouble());
        System.out.println(gt.isEmpty());
        gt.fillUp();
        System.out.println((int) gt.getGasLevel());

    }

}

class GasTankk {
    double amount = 0, capacity;

    GasTankk(double amount) {
        this.capacity = amount;
    }

    void addGas(double a) {
        this.amount += a;
        if (this.amount > this.capacity)
            this.amount = this.capacity;
    }

    void useGas(double a) {
        this.amount -= a;
        if (this.amount < 0)
            this.amount = 0;

    }

    boolean isEmpty() {
        if (this.amount < 0.1)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (this.amount > this.capacity - 0.1)
            return true;
        else
            return false;
    }

    double getGasLevel() {
        return this.amount;
    }

    double fillUp() {
        double a = 0;
        a = this.amount;
        this.amount = this.capacity;
        return this.capacity - a;

    }
}
