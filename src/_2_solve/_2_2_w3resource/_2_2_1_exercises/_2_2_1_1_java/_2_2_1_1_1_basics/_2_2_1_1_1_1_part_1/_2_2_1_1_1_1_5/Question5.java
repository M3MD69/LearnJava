package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_5;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that takes two numbers as input and displays the product of two numbers.</h2>
 * <br/>
 * <h1>Test Data:</h1>
 * <h2>
 * Input first number: 25
 * <br/>
 * Input second number: 5
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * 25 x 5 = 125
 * </h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = input.nextInt();

        System.out.print("Input second number: ");
        int number2 = input.nextInt(),
                productOfTwoNumbers = number1 * number2;

        System.out.print(number1 + " x " + number2 + " = " + productOfTwoNumbers);
    }
}