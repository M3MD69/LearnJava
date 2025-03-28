package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_93;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads a list of pairs of a word and a page number. It prints the words and a list of page numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input pairs of a word and a page number:
 * <br/>
 * apple 5
 * <br/>
 * banana 6
 * <br/>
 * <br/>
 * Word and page number in alphabetical order:
 * <br/>
 * apple
 * <br/>
 * 5
 * <br/>
 * banana
 * <br/>
 * 6
 * </h2>
 */

public class Question93 {
    public static void main(final String[] ARGUMENTS) {
        final String WORDS_AND_PAGE_NUMBERS = """
                apple 5
                banana 6""";
        System.out.printf("Input pairs of a word and a page number:\n%s\n", WORDS_AND_PAGE_NUMBERS);
        System.out.printf("Word and page number in alphabetical order:\n%s", WORDS_AND_PAGE_NUMBERS.replaceAll(" +", "\n"));
    }
}