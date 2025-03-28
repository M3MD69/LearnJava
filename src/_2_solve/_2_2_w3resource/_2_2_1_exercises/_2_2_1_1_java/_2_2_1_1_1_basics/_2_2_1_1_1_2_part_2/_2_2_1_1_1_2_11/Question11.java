package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_11;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the kth smallest and largest element in a given array. Elements in the array can be in any order.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array:
 * <br/>
 * [1, 4, 17, 7, 25, 3, 100]
 * <br/>
 * K'th smallest element of the said array:
 * <br/>
 * 3
 * <br/>
 * K'th largest element of the said array:
 * <br/>
 * 25
 * </h2>
 */

public class Question11 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 4, 17, 7, 25, 3, 100};
        System.out.printf("Original Array:\n%s\n", Arrays.toString(NUMBERS));
        Arrays.sort(NUMBERS);
        System.out.printf("K'th smallest element of the said array:\n%d\n", NUMBERS[1]);
        System.out.printf("K'th largest element of the said array:\n%d", NUMBERS[NUMBERS.length - 2]);
    }
}