package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_8_number_sum;

import java.util.Scanner;

public class NumberSumExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(numberSum(INPUT.nextInt()));
    }

    private static int numberSum(final int NUMBER) {
        return NUMBER * (NUMBER + 1) / 2;
    }
}