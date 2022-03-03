package statements;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double price = 0;
        System.out.println("Select screen size:");
        double size = s.nextDouble();

        if (size == 13.3) {
            price += 200;
        } else if (size == 15.0) {
            price += 300;
        } else if (size == 17.3) {
            price += 400;
        }

        System.out.println("Select CPU type:");
        s.nextLine();
        String cpu = s.nextLine();
        switch (cpu) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
        }

        System.out.println("Select RAM size:");
        int ram = s.nextInt();
        price += (ram / 4) * 50;
        System.out.println("Select storage type:");
        s.nextLine();
        String hdd = s.nextLine();
        System.out.println("Enter memory size:");
        int mem = s.nextInt();

        switch (hdd) {
            case "HDD":
                price += (mem / 500) * 50;
                break;
            case "SSD":
                price += (mem / 500) * 100;
        }


        System.out.println("Enter screen resolution:");
        s.nextLine();
        String res = s.nextLine();
        switch (res) {
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;

        }
        System.out.println("Laptop price is: $" + price);
    }
}
