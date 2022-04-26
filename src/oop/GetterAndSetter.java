package oop;

import java.util.Scanner;

public class GetterAndSetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Db db = new Db(in.next(), in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

        db.setData(in.next());
        db.setYint(in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

    }
}

class Db {
    private String data;
    private int yint;

    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }


}
