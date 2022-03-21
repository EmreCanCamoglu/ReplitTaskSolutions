package methods;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        s = s.trim();
        if (s.contains("PM")) {
            s = s.replace("PM", "");
            if (s.equals("12:00:00"))
                System.out.println(s);
            else {
                String[] integer = s.split(":");
                int[] integer2 = new int[integer.length];
                int i = 0;
                for (String s1 : integer) {
                    integer2[i] = Integer.parseInt(s1);
                    i++;
                }

                integer2[0] += 12;
                String output = "";
                for (int i1 : integer2) {
                    if (i1 == 0)
                        output += i1 + "" + i1 + ":";
                    else if (i1 < 10)
                        output += "0" + i1 + ":";
                    else
                        output += i1 + ":";
                }
                output = output.substring(0, output.length() - 1);
                System.out.println(output);
            }
        }
        if (s.contains("AM")) {
            s = s.replace("AM", "");
            if (s.equals("12:00:00")) System.out.println("00:00:00");
            else {
                System.out.println(s);
            }
        }
    }
}
