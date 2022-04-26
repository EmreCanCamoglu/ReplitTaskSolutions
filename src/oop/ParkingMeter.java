package oop;

import java.util.Scanner;

public class ParkingMeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParkingMeterr pm = new ParkingMeterr(in.nextInt());
        pm.add(in.nextInt());
        pm.tick();
        System.out.println(pm.timeLeft);
        System.out.println(pm.isExpired());

    }
}

class ParkingMeterr {
    public int timeLeft = 0, maxTime;

    public ParkingMeterr(int maxTime) {
        this.maxTime = maxTime;

    }

    public boolean add(int a) {
        if (a == 25)
            if (timeLeft < maxTime) {
                this.timeLeft += 30;
                return true;
            }

        return false;

    }

    public void tick() {
        if (this.timeLeft > 0)
            this.timeLeft--;
    }

    public boolean isExpired() {
        return this.timeLeft == 0;
    }

}