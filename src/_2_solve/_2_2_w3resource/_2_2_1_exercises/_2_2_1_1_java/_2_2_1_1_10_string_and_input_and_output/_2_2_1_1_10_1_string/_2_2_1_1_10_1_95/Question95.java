package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_95;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.</h2>
 */

public class Question95 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getSumOfDigitsFromText("ab5c2d4ef12s"));
    }

    private static int getSumOfDigitsFromText(final String TEXT) {
        return TEXT.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }
}