package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_69_circumference_of_circle;

import java.util.Scanner;

public class CircumferenceOfCircleExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getCircumferenceOfCircle(INPUT.nextDouble()));
    }

    private static double getCircumferenceOfCircle(final double RADIUS) {
        final double PI = 3.14;
        return RADIUS / (2 * PI);
    }
}