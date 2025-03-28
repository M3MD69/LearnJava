package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_14;

import java.util.Collections;
import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find common elements between two arrays (string values).</h2>
 */

public class Question14 {
    public static void main(final String[] ARGUMENTS) {
        final String[] FIRST_PROGRAMMING_LANGUAGES = new String[]{
                "Java",
                "XML",
                "Kotlin",
                "HTML",
                "SQL",
                "HTML",
        };
        final String[] SECOND_PROGRAMMING_LANGUAGES = new String[]{
                "Kotlin",
                "JavaScript",
                "CSS",
                "SQL",
                "JavaScript",
                "PHP",
                "Java"
        };

        printCommonElements(FIRST_PROGRAMMING_LANGUAGES, SECOND_PROGRAMMING_LANGUAGES);
    }

    private static void printCommonElements(final String[] FIRST_STRINGS, final String[] SECOND_STRINGS) {
        final HashSet<String> FIRST_DISTINCT_STRINGS = new HashSet<>(),
                SECOND_DISTINCT_STRINGS = new HashSet<>();
        Collections.addAll(FIRST_DISTINCT_STRINGS, FIRST_STRINGS);
        Collections.addAll(SECOND_DISTINCT_STRINGS, SECOND_STRINGS);

        for (final String DISTINCT_STRING : FIRST_DISTINCT_STRINGS)
            if (SECOND_DISTINCT_STRINGS.contains(DISTINCT_STRING))
                System.out.println(DISTINCT_STRING);
    }
}