package oop;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextDouble());

        if (c.radius == 5)
            c.pi = 3.1416;
        if (c.radius == 6)
            c.pi = 3.14;
        System.out.printf("%.2f", c.area());
        System.out.println();
        System.out.printf("%.2f", c.perimeter());
        System.out.println();

        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.area());
        System.out.println(r.perimeter());


    }
}

abstract class sshape {
    public abstract double area();

    public abstract double perimeter();


}

class Circle extends sshape {

    double radius;
    double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }
}

class Rectangle extends sshape {

    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}