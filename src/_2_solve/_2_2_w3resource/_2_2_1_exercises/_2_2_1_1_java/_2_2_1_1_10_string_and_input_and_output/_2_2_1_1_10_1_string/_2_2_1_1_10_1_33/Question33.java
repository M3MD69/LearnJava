package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_33;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find all interleavings of given strings.</h2>
 */

public class Question33 {
    public static void main(final String[] ARGUMENTS) {
        final String FIRST_TEXT = "AB",
                SECOND_TEXT = "CD";
        printInterleavesRecursion(
                FIRST_TEXT,
                SECOND_TEXT,
                ""
        );
    }

    private static void printInterleavesRecursion(final String FIRST_TEXT, final String SECOND_TEXT, final String AFTER_MERGE_TWO_TEXTS) {
        if ((FIRST_TEXT + SECOND_TEXT).isEmpty())
            System.out.println(AFTER_MERGE_TWO_TEXTS);
        else {
            if (!FIRST_TEXT.isEmpty())
                printInterleavesRecursion(
                        FIRST_TEXT.substring(1),
                        SECOND_TEXT,
                        AFTER_MERGE_TWO_TEXTS + FIRST_TEXT.charAt(0)
                );
            if (!SECOND_TEXT.isEmpty())
                printInterleavesRecursion(
                        FIRST_TEXT,
                        SECOND_TEXT.substring(1),
                        AFTER_MERGE_TWO_TEXTS + SECOND_TEXT.charAt(0)
                );
        }
    }
}