package methods;

import java.util.Scanner;

public class MethodsWithReturn_ValidateTask {

    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {

        return (notEmpty && (taskId == currentId + 1));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
    }
}
