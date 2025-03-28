package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_31;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.</h2>
 */

public class Question31 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 10, 10, 6, 7, 10, 8, 9, 0};
        System.out.print(areAllSumOfNumbersEquals30(NUMBERS));
    }

    private static boolean areAllSumOfNumbersEquals30(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS).filter(number -> number == 10).sum() == 30;
    }
}