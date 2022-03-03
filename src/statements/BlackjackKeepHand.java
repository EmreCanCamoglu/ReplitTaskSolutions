package statements;

import java.util.Scanner;

public class BlackjackKeepHand {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();


        if (player < house) {
            if (player > 21) {
                System.out.println("player bust");
            } else {
                System.out.println("player loss ");
            }
        }
        if (player > house) {
            if (player > 21) {
                System.out.println("player bust");
            } else {
                System.out.println("player win");
            }
        }
        if (player == house) {
            System.out.println("its a tie");
        }


    }
}
