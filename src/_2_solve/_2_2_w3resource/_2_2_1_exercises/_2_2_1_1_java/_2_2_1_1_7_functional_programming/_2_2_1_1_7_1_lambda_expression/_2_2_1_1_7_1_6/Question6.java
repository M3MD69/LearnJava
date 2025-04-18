package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_6;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to find the average of a list of doubles.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final List<Double> NUMBERS = Arrays.asList(53.5, 546.25, 125.75, 94.9);
        final double AVERAGE_NUMBERS = NUMBERS
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(-1);
        System.out.println("Original Numbers: " + NUMBERS);
        System.out.print("Average Numbers  : " + AVERAGE_NUMBERS);
    }
}