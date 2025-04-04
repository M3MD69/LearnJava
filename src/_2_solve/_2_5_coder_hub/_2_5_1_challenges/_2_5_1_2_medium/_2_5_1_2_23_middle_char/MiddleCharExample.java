package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_23_middle_char;

import java.util.Scanner;

public class MiddleCharExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(middleChar(INPUT.nextLine()));
    }

    private static String middleChar(final String TEXT) {
        return TEXT.length() % 2 == 0
                ? TEXT.substring(TEXT.length() / 2 - 1, TEXT.length() / 2 + 1)
                : String.valueOf(TEXT.charAt(TEXT.length() / 2));
    }
}