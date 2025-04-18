package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_29;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compute the average value of an array of integers except the largest and smallest values.</h2>
 */

public class Question29 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {200, 30, 40, 50};
        final int MINIMUM_NUMBER = Arrays.stream(NUMBERS).min().getAsInt(),
                MAXIMUM_NUMBER = Arrays.stream(NUMBERS).max().getAsInt();
        System.out.print(Arrays.stream(NUMBERS)
                .filter(number -> number != MINIMUM_NUMBER && number != MAXIMUM_NUMBER)
                .average()
                .orElse(-1));
    }
}