package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_59;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string. If the string begins with "red" or "black" return that color string, otherwise return the empty string.</h2>
 */

public class Question59 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isBeginRedOrBlack("RedBlackShadow"));
    }

    private static String isBeginRedOrBlack(final String TEXT) {
        if (TEXT.contains("Red"))
            return "Red";
        else if (TEXT.contains("Black"))
            return "Black";
        else
            return "";

    }
}