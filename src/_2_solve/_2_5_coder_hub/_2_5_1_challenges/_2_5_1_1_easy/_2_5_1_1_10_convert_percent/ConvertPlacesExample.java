package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_10_convert_percent;

import java.util.Scanner;

public class ConvertPlacesExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(convertPercent(INPUT.nextLine()));
    }

    private static double convertPercent(final String PERCENTAGE) {
        return Double.parseDouble(PERCENTAGE.replace("%", "")) / 100;
    }
}