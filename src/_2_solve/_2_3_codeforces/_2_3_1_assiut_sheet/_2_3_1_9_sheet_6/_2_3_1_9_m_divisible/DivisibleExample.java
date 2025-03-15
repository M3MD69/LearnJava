package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_m_divisible;

import java.util.Scanner;

/**
 * <h1>M. Divisible</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given two numbers N and X. Determine whether N is divisible by X or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>15 3</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 7</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class DivisibleExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isDivisible(INPUT.next(), INPUT.nextInt()));
    }

    private static String isDivisible(final String FIRST_NUMBER, final int SECOND_NUMBER) {
        long result = 0;
        for (int index = 0; index < FIRST_NUMBER.length(); index++) {
            result *= 10;
            result += FIRST_NUMBER.charAt(index) - '0';
            result %= SECOND_NUMBER;
        }
        return (result == 0) ? "YES" : "NO";
    }
}