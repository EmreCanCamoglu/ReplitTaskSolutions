package arrayList;

import java.util.ArrayList;

public class Add {

    public static void main(String[] args) {
        System.out.println(test().size());

    }

    public static ArrayList<String> test() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ahmet");

        return names;
    }
}
