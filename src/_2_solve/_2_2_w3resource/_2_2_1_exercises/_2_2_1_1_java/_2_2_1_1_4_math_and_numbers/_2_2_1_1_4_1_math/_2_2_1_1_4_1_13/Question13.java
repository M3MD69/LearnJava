package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_13;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the length of the longest sequence of zeros in binary representation of an integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a decimal number: 7
 * <br/>
 * Binary number is: 111
 * <br/>
 * Length of the longest sequence: 0
 * </h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final int DECIMAL_NUMBER = 8,
                BINARY_NUMBER = Integer.parseInt(Integer.toBinaryString(DECIMAL_NUMBER));
        System.out.printf("""
                        Input a decimal number: %d
                        Binary number is: %d
                        Length of the longest sequence: %d""",
                DECIMAL_NUMBER,
                BINARY_NUMBER,
                getLengthOfLongestSequence(BINARY_NUMBER));
    }

    private static int getLengthOfLongestSequence(int binary_number) {
        int lengthOfLongestSequence = 0,
                lengthOfCurrentSequence = 0;
        while (binary_number != 0) {
            if (binary_number % 10 == 1) {
                if (lengthOfCurrentSequence > lengthOfLongestSequence)
                    lengthOfLongestSequence = lengthOfCurrentSequence;
                lengthOfCurrentSequence = 0;
            } else lengthOfCurrentSequence++;
            binary_number /= 10;
        }
        if (lengthOfCurrentSequence > lengthOfLongestSequence)
            lengthOfLongestSequence = lengthOfCurrentSequence;
        return lengthOfLongestSequence;
    }
}