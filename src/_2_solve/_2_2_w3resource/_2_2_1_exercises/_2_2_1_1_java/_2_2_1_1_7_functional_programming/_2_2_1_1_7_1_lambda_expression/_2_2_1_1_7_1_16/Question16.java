package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_16;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.</h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        final List<String> TEXTS = Arrays.asList("Strawberry", "Apple", "Orange", "Banana");
        final boolean CONTAINS_THE_WORD = TEXTS.stream().anyMatch(WORD -> WORD.equals("Apple"));
        System.out.print(CONTAINS_THE_WORD);
    }
}