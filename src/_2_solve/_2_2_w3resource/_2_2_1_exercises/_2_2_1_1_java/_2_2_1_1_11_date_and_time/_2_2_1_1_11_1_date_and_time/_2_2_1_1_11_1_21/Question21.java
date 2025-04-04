package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_21;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the current time in all time zones.</h2>
 */

public class Question21 {
    public static void main(final String[] ARGUMENTS) {
        ZoneId.SHORT_IDS.keySet().forEach(
                zoneKey -> System.out.println(
                        ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)) +
                                "\n" +
                                LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey))) +
                                '\n'
                )
        );
    }
}