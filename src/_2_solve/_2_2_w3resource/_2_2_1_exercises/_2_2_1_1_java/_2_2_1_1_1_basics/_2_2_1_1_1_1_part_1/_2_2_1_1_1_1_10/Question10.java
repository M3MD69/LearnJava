package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compute the specified expressions and print the output.</h2>
 * <br/>
 * <h1>Specified Formula:</h1>
 * <h2>4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))</h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        double resultOfSpecifiedFormula = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.print(resultOfSpecifiedFormula);
    }
}
