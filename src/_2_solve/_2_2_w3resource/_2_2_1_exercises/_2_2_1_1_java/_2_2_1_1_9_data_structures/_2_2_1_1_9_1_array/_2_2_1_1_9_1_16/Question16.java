package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_16;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove duplicate elements from an array.</h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 0, 3, 4, 5, 5, 6, 7, 8, 9, 0};
        System.out.print(Arrays.toString(Arrays.stream(NUMBERS).distinct().toArray()));
    }
}