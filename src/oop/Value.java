package oop;

import java.util.Scanner;

public class Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Valuee v = new Valuee(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());
        v.setVal(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());

    }

}

class Valuee {
    int val;
    boolean modified;

    Valuee() {

    }

    Valuee(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        if (this.val == val) {
        } else {
            this.val = val;
            this.modified = true;
        }
    }

    public boolean wasModified() {
        return modified;
    }


}
