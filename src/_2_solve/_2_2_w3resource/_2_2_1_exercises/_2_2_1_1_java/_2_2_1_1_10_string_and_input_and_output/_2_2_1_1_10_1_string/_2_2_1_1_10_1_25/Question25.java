package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_25;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.</h2>
 */

public class Question25 {
    public static void main(final String[] ARGUMENTS) {
        final String FIRST_TEXT = "Nullexia-for-Programming";
        System.out.println("Before Replace: " + FIRST_TEXT);
        System.out.print("After Replace : " + FIRST_TEXT.replaceAll("-+", " "));
    }
}