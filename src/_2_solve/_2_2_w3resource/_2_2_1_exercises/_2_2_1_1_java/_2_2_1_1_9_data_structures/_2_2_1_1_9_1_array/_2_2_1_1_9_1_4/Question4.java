package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_4;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the average value of array elements.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(Arrays.stream(NUMBERS).average().orElse(-1));
    }
}