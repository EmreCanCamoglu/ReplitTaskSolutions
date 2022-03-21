package methods;

import java.util.Scanner;

public class MethodsWithString_LameDB {
    public static String lameDb(String db, String op, String id, String data) {
        String[] dbb = db.split("#");
        for (int i = 0; i < dbb.length; i++) {
            dbb[i] = dbb[i].substring(1);
        }
        int id2 = Integer.parseInt(id);
        String output = "";
        int i = 1;
        switch (op) {
            case "add":
                String[] newdbb = new String[dbb.length + 1];
                System.arraycopy(dbb, 0, newdbb, 0, dbb.length);
                if (id2 == newdbb.length) {
                    newdbb[newdbb.length - 1] = data;
                    for (String s : newdbb) {
                        output += i + "" + s + "#";
                        i++;
                    }
                } else {
                    newdbb[id2 - 1] = data;
                    for (int j = id2; j < newdbb.length; j++) {
                        newdbb[j] = dbb[j - 1];
                    }
                    for (String s : newdbb) {
                        output += i + "" + s + "#";
                        i++;
                    }
                }
                break;

            case "edit":
                dbb[id2 - 1] = data;
                for (String s : dbb) {
                    output += i + "" + s + "#";
                    i++;
                }
                break;

            case "delete":
                dbb[id2 - 1] = "";
                dbb[id2 - 1] = data;
                for (String s : dbb) {
                    if (i == id2) {
                        i++;
                        continue;
                    }
                    output += i + "" + s + "#";
                    i++;
                }
                break;

        }
        return output.substring(0, output.length() - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }
}
