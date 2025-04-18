package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_72;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to return true if a given string contains the string 'for', but the middle 'o' also may contain another character.</h2>
 */

public class Question72 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isContainForWordAndMiddleCharacterAlsoMayContainAnotherCharacter("Nullexiaf#rProgramming"));
    }

    private static boolean isContainForWordAndMiddleCharacterAlsoMayContainAnotherCharacter(final String TEXT) {
        return TEXT.matches(".*f.r.*");
    }
}