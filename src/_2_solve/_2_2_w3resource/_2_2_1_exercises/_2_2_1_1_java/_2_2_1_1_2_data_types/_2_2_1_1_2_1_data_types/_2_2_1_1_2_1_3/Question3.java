package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_2_data_types._2_2_1_1_2_1_data_types._2_2_1_1_2_1_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an integer between 0 and 1000: 565</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The sum of all digits in 565 is 16</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 565;
        System.out.printf("Input an number between 0 and 1000: %d\n", NUMBER);
        System.out.printf("The sum of all digits in %d is %d", NUMBER, getSumDigits(NUMBER));
    }

    private static int getSumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}