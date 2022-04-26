package oop;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ssquare s = new ssquare(in.nextDouble());
        cube c = new cube(in.nextDouble());
        rrectangle r = new rrectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.getLength());
        r.setLength(in.nextDouble());
        System.out.println(r.getLength());
        System.out.println(s.getLength());
        System.out.println(s.circumferenceCalc());
        System.out.println(c.circumferenceCalc());

    }
}

class ssquare {
    double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public ssquare(double length) {
        this.length = length;
    }

    public double circumferenceCalc() {
        return length * 4;
    }
}

class cube extends ssquare {

    public cube(double length) {
        super(length);
    }

    @Override
    public double circumferenceCalc() {
        return super.circumferenceCalc() * 3;
    }

    public double volumeCalc() {
        return length * length * length;

    }
}

class rrectangle extends ssquare {

    double heigth;

    public rrectangle(double length, double heigth) {
        super(length);
        this.heigth = heigth;
    }

    @Override
    public double circumferenceCalc() {
        return length * 2 + heigth * 2;
    }
}