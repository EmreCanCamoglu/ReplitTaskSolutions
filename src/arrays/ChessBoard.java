package arrays;

import java.util.Arrays;

public class ChessBoard {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        char k;
        String c;

        for (int a = 1; a <= 8; a++) {
            k = 'a';
            for (int h = 0; h < 8; h++) {
                c = a + "" + k;
                chessBoard[a - 1][h] = c;
                k++;
            }

        }


        System.out.println(Arrays.deepToString(chessBoard));
    }
}
