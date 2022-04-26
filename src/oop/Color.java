package oop;

import java.util.Arrays;
import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Colorr color = new Colorr();
        System.out.println(color.toString());

        Colorr color2 = new Colorr(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(color2.toString());

    }
}

class Colorr {
    private int[] rgb = new int[3];


    public final static int[] WHITE = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY = new int[]{64, 64, 64};
    public final static int[] BLACK = new int[]{0, 0, 0};
    public final static int[] RED = new int[]{255, 0, 0};
    public final static int[] PINK = new int[]{255, 175, 175};
    public final static int[] ORANGE = new int[]{255, 200, 0};
    public final static int[] YELLOW = new int[]{255, 255, 0};
    public final static int[] GREEN = new int[]{0, 255, 0};
    public final static int[] MAGENTA = new int[]{255, 0, 255};
    public final static int[] CYAN = new int[]{0, 255, 255};
    public final static int[] BLUE = new int[]{0, 0, 255};

    private int[][] colorChart = new int[][]{WHITE, LIGHT_GRAY, GRAY, DARK_GRAY, BLACK, RED, PINK, ORANGE, YELLOW, GREEN, MAGENTA, CYAN, BLUE};
    private String[] colorNames = new String[]{"white", "light gray", "gray", "dark gray", "black", "red", "pink", "orange", "yellow", "green", "magenta", "cyan", "blue"};


    public Colorr(int r, int g, int b) {
        rgb[0] = r;
        rgb[1] = g;
        rgb[2] = b;
    }

    public Colorr() {
        rgb = WHITE;
    }

    @Override
    public String toString() {
        int i = 0;
        while (i < colorChart.length) {
            if (Arrays.equals(this.rgb, this.colorChart[i]))
                return colorNames[i];
            i++;
        }
        return "n/a";
    }
}