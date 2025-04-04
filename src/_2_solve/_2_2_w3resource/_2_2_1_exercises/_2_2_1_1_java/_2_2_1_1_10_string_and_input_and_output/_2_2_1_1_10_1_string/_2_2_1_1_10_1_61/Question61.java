package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_61;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a new string taking specified number of characters from first and last position of a given string.</h2>
 */

public class Question61 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getSpecifiedNumberOfCharactersFromFirstAndLastPositionOfText("Java", 3));
    }

    private static String getSpecifiedNumberOfCharactersFromFirstAndLastPositionOfText(final String TEXT, final int SPECIFIC_NUMBER) {
        return TEXT.substring(0, SPECIFIC_NUMBER) + TEXT.substring(TEXT.length() - SPECIFIC_NUMBER);
    }
}