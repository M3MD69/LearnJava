package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_35;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to find the sum of the two elements of a given array equal to a given integer.
 * <br/>
 * Sample array: [1,2,4,5,6]
 * <br/>
 * Target value: 6.
 * </h2>
 */

public class Question35 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 4, 5, 6};
        System.out.print(getTwoIndicesOfSuTwoNumbersSumEqualsSpecificNumber(NUMBERS, 6));
    }

    private static String getTwoIndicesOfSuTwoNumbersSumEqualsSpecificNumber(final int[] NUMBERS, final int SPECIFIC_NUMBER) {
        for (int firstNumberIndex = 0; firstNumberIndex < NUMBERS.length - 1; firstNumberIndex++) {
            final int FIRST_NUMBER = NUMBERS[firstNumberIndex];
            for (int secondNumberIndex = firstNumberIndex + 1; secondNumberIndex < NUMBERS.length; secondNumberIndex++) {
                final int SECOND_NUMBER = NUMBERS[secondNumberIndex];
                if (FIRST_NUMBER + SECOND_NUMBER == SPECIFIC_NUMBER)
                    return String.format("""
                                    First Number Index: %d
                                    Second Second Index: %d
                                    %d + %d = %d""",
                            firstNumberIndex,
                            secondNumberIndex,
                            FIRST_NUMBER,
                            SECOND_NUMBER,
                            FIRST_NUMBER + SECOND_NUMBER);
            }
        }
        return "Nothing!";
    }
}