package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_112;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compute the number of trailing zeros in a factorial. 7! = 5040, therefore the output should be 1</h2>
 */

public class Question112 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int NUMBER = input.nextInt();

        System.out.println("Sum of trailing zeros in a factorial " + NUMBER + " is " + getSumTrailingZerosFactorial(NUMBER));
    }

    private static int getSumTrailingZerosFactorial(int number) {
        int zerosCount = 0;
        while (number != 0) {
            zerosCount += number / 5;
            number /= 5;
        }
        return zerosCount;
    }
}