package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the number of days between two years.</h2>
 */

public class Question46 {
    public static void main(final String[] ARGUMENTS) {
        final LocalDate FIRST_YEAR = LocalDate.of(2003, 1, 1),
                SECOND_YEAR = LocalDate.of(2005, 1, 1);
        final long DIFFERENCE_DAYS = ChronoUnit.DAYS.between(FIRST_YEAR, SECOND_YEAR);
        System.out.print(Math.abs(DIFFERENCE_DAYS));
    }
}