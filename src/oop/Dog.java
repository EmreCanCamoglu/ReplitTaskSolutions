package oop;

import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dogg dog = new Dogg(in.next(), in.nextInt(), in.next());
        Dogg dog2 = new Dogg(in.next(), in.nextInt(), in.next());
        System.out.println(dog);
        System.out.println(dog.equals(dog2));

    }
}

abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


}

class Dogg extends Animal {
    private String breed;
    private int humanYears;

    public String getBreed() {
        return breed;
    }

    public Dogg(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        if (age > 2)
            this.humanYears = 22 + ((age - 2) * 5);
        else
            this.humanYears = age * 11;

    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nBreed: " + this.breed + "\nAge in calendar years: " + getAge() + "\nAge in human years: " + this.humanYears;
    }


    public boolean equals(Dogg b) {
        return getName().equals(b.getName()) && getAge() == b.getAge() && getBreed().equals(b.getBreed());
    }
}