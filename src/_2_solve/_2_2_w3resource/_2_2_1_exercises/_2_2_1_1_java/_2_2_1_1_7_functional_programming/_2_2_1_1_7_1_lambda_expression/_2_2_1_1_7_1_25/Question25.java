package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_25;

import java.util.function.Function;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.</h2>
 */

public class Question25 {
    public static void main(final String[] ARGUMENTS) {
        final Function<Long, String> DECIMAL_TO_BINARY = Long::toBinaryString;
        System.out.print(DECIMAL_TO_BINARY.apply(10L));
    }
}