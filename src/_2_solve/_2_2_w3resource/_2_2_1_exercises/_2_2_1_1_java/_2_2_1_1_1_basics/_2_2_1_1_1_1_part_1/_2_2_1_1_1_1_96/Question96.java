package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_96;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if there is a 10 in an array of integers with a 20 somewhere later on.</h2>
 */

public class Question96 {
    public static void main(final String[] ARGUMENTS) {
        int[] array = {333, 32, 547, 10, 45, 4562, 789, 20, 59};
        byte status = 0;
        for (int number:array)
            if (number == 10) status = 1;
            else if (number == 20 && status == 1) {
                status = 2;
                break;
            }
        System.out.print(status == 2);
    }
}