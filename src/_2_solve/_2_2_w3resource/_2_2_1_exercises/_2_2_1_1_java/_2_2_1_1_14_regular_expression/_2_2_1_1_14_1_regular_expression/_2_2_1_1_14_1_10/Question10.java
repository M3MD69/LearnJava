package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove leading zeros from a given IP address.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "08.008.000802.00008";
        System.out.print(removeZerosFrom_IP_Text(TEXT));
    }

    private static String removeZerosFrom_IP_Text(final String TEXT) {
        return TEXT.replaceAll(
                "0+(\\d+)",
                "$1"
        );
    }

// >
    /*private static String removeZerosFrom_IP_Text(final String TEXT) {
        return String.join(
                ".",
                Arrays.stream(TEXT.split("\\."))
                        .map(word -> String.valueOf(Integer.parseInt(word)))
                        .toArray(String[]::new)
        );
    }*/
}