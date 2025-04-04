package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_16;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to replace all vowels in a string with a specified character.</h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Java Programming Language";
        final char SPECIFIC_CHARACTER = '_';
        System.out.print(getTextAfterReplaceAllVowelsWithSpecificCharacter(TEXT, SPECIFIC_CHARACTER));
    }

    private static String getTextAfterReplaceAllVowelsWithSpecificCharacter(final String TEXT, final char SPECIFIC_CHARACTER) {
        return TEXT.replaceAll(
                "[AaEeIiOoUu]",
                "" + SPECIFIC_CHARACTER
        );
    }
}