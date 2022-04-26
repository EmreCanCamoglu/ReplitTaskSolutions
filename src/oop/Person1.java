package oop;

import java.util.Scanner;

public class Person1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        person.setAge(in.nextInt());
        System.out.println(person.getAge());

        Person person2 = new Person(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getLastName());
        System.out.println(person2.toString());


    }
}

class Person {
    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.firstName + " | " + this.lastName + " | " + this.age;
    }
}
