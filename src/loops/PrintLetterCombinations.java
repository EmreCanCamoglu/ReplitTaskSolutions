package loops;

public class PrintLetterCombinations {
    public static void main(String[] args) {

        char a, b;

        for (int i = 122; i > 117; i--) {

            for (int j = 122; j > 117; j--) {

                a = (char) i;
                b = (char) j;


                System.out.println(a + "" + b);

            }


        }


    }


}
