package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_1_conditional_statement._2_2_1_1_3_1_20;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print Floyd's Triangle.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of rows: 5</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input number of rows: 5
 * <br/>
 * 1
 * <br/>
 * 2 3
 * <br/>
 * 4 5 6
 * <br/>
 * 7 8 9 10
 * <br/>
 * 11 12 13 14 15
 * </h2>
 */

public class Question20 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER_OF_ROWS = 5;
        System.out.printf("Input number of rows: %d\n", NUMBER_OF_ROWS);
        printTriangleNumbers(NUMBER_OF_ROWS);
    }

    private static void printTriangleNumbers(final int NUMBER_OF_ROWS) {
        int number = 1;
        for (int currentLineLength = 1; currentLineLength <= NUMBER_OF_ROWS; currentLineLength++) {
            for (int counter = 1; counter <= currentLineLength; counter++) {
                System.out.print(number++);
                if (counter < currentLineLength)
                    System.out.print(" ");
            }
            if (currentLineLength < NUMBER_OF_ROWS)
                System.out.println();
        }
    }
}