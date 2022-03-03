package loops;

public class PrintEvenFrom80to20 {
    public static void main(String[] args) {

        int i = 80;
        while (i > 18) {
            System.out.print(i);


            if (i == 20) {
                break;
            }

            i -= 2;
            System.out.print(" ");
        }

    }
}
