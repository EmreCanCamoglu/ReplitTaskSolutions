package oop;

import java.util.Scanner;

public class CalcII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        Calc a = new Calc();
        a.setX(one);
        a.setY(two);
        a.plus();
        System.out.println(a.getResult());
        a.minus();
        System.out.println(a.getResult());
    }
}

class Calc {
    private String names;
    private int x, y, result;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void plus() {
        this.result = x + y;
    }

    public void minus() {
        this.result = x - y;
    }
}