package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_7_binary_to_octal;

import java.util.Scanner;

public class BinaryToOctalExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getOctalNumberFromBinaryNumber(INPUT.nextLine()));
    }

    private static int getOctalNumberFromBinaryNumber(final String BINARY_NUMBER) {
        return Integer.parseInt(
                Integer.toOctalString(
                        Integer.parseInt(
                                BINARY_NUMBER,
                                2
                        )
                )
        );
    }
}