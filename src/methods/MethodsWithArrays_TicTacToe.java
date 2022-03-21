package methods;

import java.util.Scanner;

public class MethodsWithArrays_TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] game = new char[9];
        for (int i = 0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }

    public static String won(char[] x) {
        char X = 'X';
        if (X == x[0] && X == x[1] && X == x[2] ||
                X == x[0] && X == x[3] && X == x[6] ||
                X == x[0] && X == x[4] && X == x[8] ||
                X == x[1] && X == x[4] && X == x[7] ||
                X == x[2] && X == x[5] && X == x[8] ||
                X == x[2] && X == x[4] && X == x[6] ||
                X == x[3] && X == x[4] && X == x[5] ||
                X == x[6] && X == x[7] && X == x[8]) {
            return "Player X won";
        } else
            return "Player O won";

    }
}
