package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_42;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print a list of items containing all characters of a given word.</h2>
 */

public class Question42 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(
                Arrays.toString(getTextsContainingAllCharactersOfText(
                        new String[]{"Nullexia", "for", "Programming"},
                        "orrr"
                ))
        );
    }

    private static String[] getTextsContainingAllCharactersOfText(final String[] TEXTS, final String TEXT) {
        return Arrays.stream(TEXTS)
                .filter(
                        text -> text.chars()
                                .anyMatch(
                                        currentCharacter -> TEXT.chars()
                                                .anyMatch(
                                                        anotherCharacter -> currentCharacter == anotherCharacter
                                                )
                                )
                ).toArray(String[]::new);
    }
}