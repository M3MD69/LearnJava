package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_6_hash_map._2_2_1_1_9_3_6_11;

import java.util.HashMap;
import java.util.Set;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get a set view of the keys contained in this map.</h2>
 */

public class Question11 {
    private static final HashMap<String, String> COLORS = new HashMap<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        final Set<String> COLORS_CODES = COLORS.keySet();
        System.out.print(COLORS_CODES);
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}