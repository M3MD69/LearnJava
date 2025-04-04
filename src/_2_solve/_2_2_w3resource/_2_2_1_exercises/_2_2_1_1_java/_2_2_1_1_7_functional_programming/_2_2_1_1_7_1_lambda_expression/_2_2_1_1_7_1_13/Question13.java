package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_13;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to count words in a sentence.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Hello Java";
        final TextMethod COUNT_OF_WORDS_OF_TEXT = (WORDS) -> WORDS.split(" +").length;
        System.out.print(COUNT_OF_WORDS_OF_TEXT.countOfWords(TEXT));
    }
}

interface TextMethod {
    long countOfWords(final String TEXT);
}