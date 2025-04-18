package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a floating value to an absolute value.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a float number: -12.53
 * <br/>
 * The absolute value of -12.53 is: 12.53
 * </h2>
 */

public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        final float NUMBER = -12.53F;
        System.out.printf("""
                        Input a float number: %f
                        The absolute value of %f is: %f""",
                NUMBER,
                NUMBER,
                NUMBER >= 0 ?
                        NUMBER :
                        -NUMBER);
    }
}