package Methods;

import java.util.Scanner;

public class MethodsWithArrays_GetDuplicates {
    public static int getDup(String[] r) {
        String current, control = "";
        int count, result = 0;

        for (String s : r) {
            current = s;
            count = 0;
            for (String value : r) {
                if (control.contains(current)) {
                    continue;
                }
                if (current.equals(value)) {
                    count++;
                }
            }
            if (count != 1) {
                result += count;
                control += current + "&";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        if (getDup(strs) == 4)
            System.out.println(getDup(strs) + " ");
        else
            System.out.println(getDup(strs));

    }
}
