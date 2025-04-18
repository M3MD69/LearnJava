package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_24;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find a missing number in an array.</h2>
 */

public class Question24 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 6, 7};
        System.out.print(summationFromOneToTargetNumberInclusive(NUMBERS.length + 1) - Arrays.stream(NUMBERS).sum());
    }

    private static long summationFromOneToTargetNumberInclusive(final long TARGET_NUMBER) {
        return TARGET_NUMBER * (TARGET_NUMBER + 1) / 2;
    }
}