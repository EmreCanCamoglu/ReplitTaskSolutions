package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class SwitchElements {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};

        System.out.println(Arrays.toString(do_switch(arr)).replace(" ", ""));
    }


    public static int[] do_switch(int[] i) {

        int temp = i[0];
        i[0] = i[3];
        i[3] = temp;

        return i;
    }
}
