package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_75;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a given substring appears in the middle of another string. Here middle means the difference between the number of characters to the left and right of the given substring is not more than 1.</h2>
 */

public class Question75 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isSubTextInMiddleOfText("____Mohamed____", "Mohamed"));
    }

    private static boolean isSubTextInMiddleOfText(final String TEXT, final String SPECIFIC_SUB_TEXT) {
        return Math.abs(
                (TEXT.length() - SPECIFIC_SUB_TEXT.length()) /
                        2 - TEXT.indexOf(SPECIFIC_SUB_TEXT)
        ) <= 1;
    }
}