package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_88;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the current system environment and system properties.</h2>
 */

public class Question88 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("Current System Environment:\n" + System.getenv());
        System.out.print("\nSystem Properties:\n" + System.getProperties());
    }
}