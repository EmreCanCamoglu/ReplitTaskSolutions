package Methods;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        int[] fibo = new int[num + 1];
        fibo[2] = 1;
        fibo[1] = 1;
        fibo[0] = 0;
        int count = 2;
        for (int i = 3; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            count++;
        }
        System.out.println(fibo[count]);
    }
}
