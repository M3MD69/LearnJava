package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_21_has_space;

import java.util.Scanner;

public class HasSpaceExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(hasSpace(INPUT.nextLine()));
    }

    private static String hasSpace(final String TEXT) {
        return TEXT.replaceAll(" +", "#");
    }
}