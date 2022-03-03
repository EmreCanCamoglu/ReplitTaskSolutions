package loops;

public class UtopianTree {
    public static void main(String[] args) {


        int i = 1, total = 0;
        while (i < 4) {
            System.out.println("year " + i + " - growth " + 1 + " cm");
            total += 1;
            System.out.println("tree size: " + total + "cm");

            i++;

        }
        i = 4;
        while (i < 11) {
            System.out.println("year " + i + " - growth " + 2 + " cm");
            total += 2;
            System.out.println("tree size: " + total + "cm");

            i++;

        }

    }
}
