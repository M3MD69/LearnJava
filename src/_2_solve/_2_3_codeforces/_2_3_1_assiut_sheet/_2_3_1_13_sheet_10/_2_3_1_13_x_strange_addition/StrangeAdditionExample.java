package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_x_strange_addition;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * <h1>X. Strange Addition</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 100 10 1 0
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 4
 * <br/>
 * 0 1 10 100
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 2 70 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2
 * <br/>
 * 2 70
 * </h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_x_strange_addition.images <h2>Question</h2>
 */

public class StrangeAdditionExample {
    private static byte countOfNumbers;
    private static byte[] numbers;
    private static final List<Byte> VASYA_NUMBERS = new ArrayList<>();
    private static boolean gotNumberWithDigitZero = false;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputNumbers();
        printVasyaNumbers();
    }

    private static void printVasyaNumbers() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        if (gotNumberWithDigitZero) {
            for (byte index = 0; index < countOfNumbers; index++)
                if (numbers[index] >= 10 && numbers[index] < 100 && numbers[index] % 10 == 0) {
                    VASYA_NUMBERS.add(numbers[index]);
                    break;
                }
        } else {
            for (byte index = 0; index < countOfNumbers; index++)
                if (numbers[index] >= 10 && numbers[index] < 100) {
                    VASYA_NUMBERS.add(numbers[index]);
                    break;
                }
        }

        OUTPUT.write(String.valueOf(VASYA_NUMBERS.size()));
        OUTPUT.newLine();
        for (final byte VASYA_NUMBER : VASYA_NUMBERS) OUTPUT.write(VASYA_NUMBER + " ");
        OUTPUT.flush();
    }

    private static void inputNumbers() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfNumbers = Byte.parseByte(INPUT.readLine());
        numbers = new byte[countOfNumbers];
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (byte index = 0; index < countOfNumbers; index++) {
            numbers[index] = Byte.parseByte(LINE.nextToken());
            if (numbers[index] == 0 || numbers[index] == 100) VASYA_NUMBERS.add(numbers[index]);
            else if (numbers[index] >= 1 && numbers[index] <= 9 && !gotNumberWithDigitZero) {
                VASYA_NUMBERS.add(numbers[index]);
                gotNumberWithDigitZero = true;
            }
        }
    }
}