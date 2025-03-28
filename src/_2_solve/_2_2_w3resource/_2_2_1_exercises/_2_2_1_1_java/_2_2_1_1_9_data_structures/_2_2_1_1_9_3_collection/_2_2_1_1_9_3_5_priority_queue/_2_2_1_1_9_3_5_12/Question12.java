package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_5_priority_queue._2_2_1_1_9_3_5_12;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to change priorityQueue to maximum priority queue.</h2>
 */

public class Question12 {
    private static final PriorityQueue<String> COLORS = new PriorityQueue<>(6, Collections.reverseOrder());

    public static void main(final String[] ARGUMENTS) {
        addColors();
        String color;
        while ((color = COLORS.poll()) != null)
            System.out.print(color + ' ');
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}