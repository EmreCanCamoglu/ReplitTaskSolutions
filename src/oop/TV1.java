package oop;

import java.util.Scanner;

public class TV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(in.nextInt());

        TV tv2 = new TV(in.next());
        tv2.turnOn();
        tv2.turnOn();
        tv2.setChannel(in.nextInt());
        tv2.setChannel(in.nextInt());
        tv2.setVolumeLevel(in.nextInt());
        tv2.volumeUp();
    }
}

class TV {
    private int channel = 1, volumeLevel = 0;
    private boolean on = false;
    private String brand = "undefined";

    TV() {
        System.out.println("Creating TV object using no args-constructor");
    }

    TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > 0 && channel < 121 && isOn())
            this.channel = channel;
        else
            System.out.println("ERROR: TV is either OFF or invalid Channel");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel > 0 && volumeLevel < 7 && isOn())
            this.volumeLevel = volumeLevel;
        else
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        this.channel--;
    }

    public void volumeUp() {
        this.volumeLevel++;
    }

    public void volumeDown() {
        this.volumeLevel--;
    }

    public boolean isOn() {
        return this.on;
    }

    public void turnOn() {
        if (isOn())
            System.out.println("TV is already ON");
        else
            this.on = true;

    }

    public void turnOff() {
        if (!isOn())
            System.out.println("TV is already OFF");
        else
            this.on = false;
    }
}
