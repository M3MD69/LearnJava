package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_5_priority_queue._2_2_1_1_9_3_5_11;

import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a Priority Queue element to string representations.</h2>
 */

public class Question11 {
    private static final PriorityQueue<String> COLORS = new PriorityQueue<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        final String COLORS_AS_STRING = COLORS.toString();
        System.out.print(COLORS_AS_STRING);
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}